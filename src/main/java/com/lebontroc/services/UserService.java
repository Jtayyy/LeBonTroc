package com.lebontroc.services;

import com.lebontroc.DAO.UserDao;
import com.lebontroc.DTO.UserDto;
import com.lebontroc.DTO.UserMapper;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
    public User findById(int id) {
        return userDao.findById(id).orElseThrow(RuntimeException::new);
    }
    public void delete(User user) {
        userDao.delete(user);
    }

    @Transactional
    public void addUser(UserDto userDto) {
        User user;
        try {
            user = UserMapper.fromDto(userDto, null, null);
        } catch (IOException e) {
            throw new RuntimeException("Error with User image", e);
        }
        userDao.save(user);
    }
}
