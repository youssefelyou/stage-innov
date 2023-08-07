package com.example.stageinnov.service;

import com.example.stageinnov.entity.Field;
import com.example.stageinnov.repository.FieldRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FieldService {
    
    @Autowired
    private FieldRepository fieldRepository;

    public List<Field> findAll() {
        return fieldRepository.findAll();
    }

    public Field save(Field field) {
        return fieldRepository.save(field);
    }

    public Optional<Field> findById(Integer id) {
        return fieldRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        fieldRepository.deleteById(id);
    }
}
