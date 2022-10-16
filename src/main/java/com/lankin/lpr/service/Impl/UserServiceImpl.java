package com.lankin.lpr.service.Impl;

import com.lankin.lpr.exception.ResourceNotFoundException;
import com.lankin.lpr.model.User;
import com.lankin.lpr.repository.UserRepository;
import com.lankin.lpr.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("User", "Id", id));
    }

    @Override
    public User updateUser(User user, long id) {
        User existingUser = userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("User", "Id", id));

        existingUser.setLogin(user.getLogin());
        existingUser.setCredentials(user.getCredentials());
        existingUser.setEmail(user.getEmail());
        existingUser.setGender(user.getGender());
        existingUser.setBirthday(user.getBirthday());
        existingUser.setRole(user.getRole());
        userRepository.save(existingUser);
        return existingUser;
    }

    @Override
    public void deleteUser(long id) {
        userRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("User", "Id", id));
        userRepository.deleteById(id);
    }
}
