package com.example.stageinnov.repository;

import com.example.stageinnov.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
    Company findFirstByOrderByIdAsc();
}
