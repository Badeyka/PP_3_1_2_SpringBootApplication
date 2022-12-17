package com.example.pp_3_1_2_springbootapplication.service;

import com.example.pp_3_1_2_springbootapplication.dao.UserDao;
import com.example.pp_3_1_2_springbootapplication.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void update(User updateUser) {
        userDao.update(updateUser);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
