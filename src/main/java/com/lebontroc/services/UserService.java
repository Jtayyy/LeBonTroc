package com.lebontroc.services;

import com.lebontroc.DAO.UserDao;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
    public void save(User user) {
        userDao.save(user);
    }

    public void modify(User user) {
        userDao.deleteById(user.getId());
        userDao.save(user);
    }
}
