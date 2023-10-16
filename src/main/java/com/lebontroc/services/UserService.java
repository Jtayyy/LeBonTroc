package com.lebontroc.services;

import com.lebontroc.DAO.UserDao;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
