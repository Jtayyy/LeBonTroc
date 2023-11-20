package com.lebontroc.services;

import com.lebontroc.DAO.UserDao;
import com.lebontroc.DTO.UserDto;
import com.lebontroc.DTO.UserMapper;
import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;

    public List<User> findAll() {
        return userDao.findAll();
    }
    public User findById(int id) {
        return userDao.findById(id).orElseThrow(() -> new RuntimeException("User not found for id: " + id));
    }
    public User findByEmail(String email){
        return userDao.findUserByEmail(email).orElseThrow(() -> new RuntimeException("User not found for email: " + email));
    }
    public void deleteById(int id) {
        if (userDao.existsById(id)) {
            userDao.deleteById(id);
        } else {
            throw new RuntimeException("User not found for id: " + id);
        }
    }

    @Transactional
    public void register(UserDto userDto) {
        if (userDao.findUserByEmail(userDto.getEmail()).isPresent()) {
            throw new RuntimeException("User with email " + userDto.getEmail() + " already exists");
        }

        User user;
        try {
            user = UserMapper.fromDto(userDto, null, null);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        } catch (IOException e) {
            throw new RuntimeException("Error with User image", e);
        }
        userDao.save(user);

    }

    @Transactional
    public void update(UserDto userDto, int id) {
        User existingUser = userDao.findById(id).orElseThrow(() -> new NoSuchElementException("User doesn't exist"));
        User updatedUser;
        try {
            updatedUser = UserMapper.fromDto(userDto, id, null);
            if (!userDto.getPassword().equals(existingUser.getPassword())) {
                updatedUser.setPassword(passwordEncoder.encode(userDto.getPassword()));
            }
        } catch (IOException e) {
            throw new RuntimeException("Error with user image", e);
        }
        userDao.save(updatedUser);
    }

    public User login(String email, String password) {
        User user = userDao.findUserByEmail(email).orElseThrow(() -> new RuntimeException("User not found for email: " + email));
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }
        System.out.println("Password valid");
        return user;
    }

    public List<Post> findPostsByUserId(int id){ return userDao.findPostsByUserId(id); }

    public List<Post> findFavoritesByUserId(int id){ return userDao.findFavoritesByUserId(id); }

    public List<Object> findAllObjectsFromUser(int id){ return userDao.findAllObjectsFromUser(id); }
}
