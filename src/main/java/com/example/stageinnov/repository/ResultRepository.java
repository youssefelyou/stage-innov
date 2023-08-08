package com.example.stageinnov.repository;

import com.example.stageinnov.entity.Field;
import com.example.stageinnov.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
}
