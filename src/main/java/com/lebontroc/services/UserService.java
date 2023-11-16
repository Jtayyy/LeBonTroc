package com.lebontroc.services;

import com.lebontroc.DAO.UserDao;
import com.lebontroc.DTO.UserDto;
import com.lebontroc.DTO.UserMapper;
import com.lebontroc.models.Object;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
    public User findById(int id) {
        return userDao.findById(id).orElseThrow(() -> new RuntimeException("User not found for id: " + id));
    }
    public void deleteById(int id) {
        if (userDao.existsById(id)) {
            userDao.deleteById(id);
        } else {
            throw new RuntimeException("User not found for id: " + id);
        }
    }

    @Transactional
    public void add(UserDto userDto) {
        User user;
        try {
            user = UserMapper.fromDto(userDto, null, null);
        } catch (IOException e) {
            throw new RuntimeException("Error with User image", e);
        }
        userDao.save(user);
    }

    @Transactional
    public void update(UserDto userDto, int id) {
        userDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));
        User user;
        try {
            user = UserMapper.fromDto(userDto, id, null);
        } catch (IOException e) {
            throw new RuntimeException("Error with user image", e);
        }
        userDao.save(user);
    }

    public List<Object> getObjectsOfUser(int id){ return userDao.getAllObjectsFromUser(id); }
}
