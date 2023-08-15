package com.example.stageinnov.service;

import com.example.stageinnov.entity.FieldValue;
import com.example.stageinnov.entity.Result;
import com.example.stageinnov.repository.FieldRepository;
import com.example.stageinnov.repository.FieldValueRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FieldValueService {



    @Autowired
    private FieldValueRepository fieldValueRepository;


    public FieldValue save(FieldValue fieldValue) {
        return fieldValueRepository.save(fieldValue);
    }

    public Optional<FieldValue> findById(Integer id) {
        return fieldValueRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        fieldValueRepository.deleteById(id);
    }

    public List<FieldValue> findAll() {
        return fieldValueRepository.findAll();
    }
    public List<FieldValue> findByFieldId(int id) {
        return fieldValueRepository.findByFieldId(id);
    }

    public void update(Integer id, FieldValue fieldValueInfo) {
        FieldValue fieldValue=fieldValueRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("filedvalue not found with id " + id));
        fieldValue.setValue(fieldValueInfo.getValue());
        fieldValueRepository.save(fieldValue);
    }


}
