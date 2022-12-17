package com.example.pp_3_1_2_springbootapplication.dao;

import com.example.pp_3_1_2_springbootapplication.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(int id);

    void save(User user);

    void update(User user);

    void delete(int id);
}
