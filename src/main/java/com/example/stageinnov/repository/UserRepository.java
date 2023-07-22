package com.example.stageinnov.repository;

import com.example.stageinnov.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUsername(String username);
    Optional<User> findByEmail(String email);
    List<User> findAll();
}

