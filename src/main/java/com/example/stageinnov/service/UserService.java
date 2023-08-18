package com.example.stageinnov.service;

import com.example.stageinnov.entity.Result;
import com.example.stageinnov.entity.Role;
import com.example.stageinnov.entity.User;
import com.example.stageinnov.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public User  save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public List<User> findByRole(Role role) {
        return userRepository.findByRole(role);
    }

    public void update(Integer id, User userInfo) {
        User user=userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user not found with id " + id));
        user.setFirstName(userInfo.getFirstName());
        user.setLastName(userInfo.getLastName());
        user.setUsername(userInfo.getUsername());
        user.setRole(userInfo.getRole());
        user.setPassword(userInfo.getPassword());
        user.setTel(userInfo.getTel());
        userRepository.save(user);

    }


}
