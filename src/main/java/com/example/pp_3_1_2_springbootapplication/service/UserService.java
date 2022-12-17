package com.example.pp_3_1_2_springbootapplication.service;

import com.example.pp_3_1_2_springbootapplication.models.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(int id);

    void save(User user);

    void update(User updateUser);

    void delete(int id);

}
