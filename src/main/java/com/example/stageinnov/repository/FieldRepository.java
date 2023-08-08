package com.example.stageinnov.repository;

import com.example.stageinnov.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldRepository extends JpaRepository<Field,Integer> {
    List<Field> findFieldsByResultId(int id);
}
