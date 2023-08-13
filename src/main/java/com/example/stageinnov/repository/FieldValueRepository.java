package com.example.stageinnov.repository;

import com.example.stageinnov.entity.FieldValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FieldValueRepository extends JpaRepository<FieldValue,Integer> {
    List<FieldValue> findByFieldId(int id);
}
