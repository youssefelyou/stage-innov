package com.example.stageinnov.repository;

import com.example.stageinnov.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository<Field,Integer> {
}
