package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Company;
import com.example.stageinnov.service.CompanyService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/company")
@CrossOrigin
public class CompanyController {


    @Autowired
    private CompanyService companyService;

    @PostMapping("/")
    public Company save(@RequestBody Company company) {
        return companyService.save(company);
    }

    @GetMapping("/{id}")
    public Optional<Company> findById(@PathVariable Integer id) {
        return companyService.findById(id);
    }

    @GetMapping("/")
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteById(@PathVariable Integer id) {
        companyService.deleteById(id);
    }

    @GetMapping("/getfirst")
    public Company findFirstByOrderByIdAsc() {
        return companyService.findFirstByOrderByIdAsc();
    }



}
