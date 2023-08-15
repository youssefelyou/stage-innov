package com.example.stageinnov.service;

import com.example.stageinnov.entity.Company;
import com.example.stageinnov.entity.Field;
import com.example.stageinnov.repository.CompanyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;



    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public Optional<Company> findById(Integer id) {
        return companyRepository.findById(id);
    }




    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Transactional
    public void deleteById(Integer id) {
        companyRepository.deleteById(id);
    }




}
