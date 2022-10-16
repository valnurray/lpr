package com.lankin.lpr.service;

import com.lankin.lpr.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUsers();
    User getUserById(long id);
    User updateUser(User user, long id);
    void deleteUser(long id);
}
