package com.example.stageinnov.service;

import com.example.stageinnov.entity.Admin;
import com.example.stageinnov.repository.AdminRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    public Optional<Admin> findById(Integer id) {
        return adminRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        adminRepository.deleteById(id);
    }
}
