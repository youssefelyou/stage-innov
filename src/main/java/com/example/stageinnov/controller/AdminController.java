package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Admin;
import com.example.stageinnov.service.AdminService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public List<Admin> findAll() {
        return adminService.findAll();
    }

    @PostMapping("/save")
    public Admin save(@RequestBody Admin admin) {
        return adminService.save(admin);
    }

    @GetMapping("/{id}")
    public Optional<Admin> findById(@PathVariable Integer id) {
        return adminService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        adminService.deleteById(id);
    }
}
