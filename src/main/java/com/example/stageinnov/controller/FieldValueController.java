package com.example.stageinnov.controller;

import com.example.stageinnov.entity.FieldValue;
import com.example.stageinnov.service.FieldValueService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fieldvalue")
@CrossOrigin
public class FieldValueController {

    @Autowired
    private FieldValueService fieldValueService;

    @PostMapping("/save")
    public FieldValue save(@RequestBody FieldValue fieldValue) {
        return fieldValueService.save(fieldValue);
    }

    @GetMapping("/{id}")
    public Optional<FieldValue> findById(@PathVariable Integer id) {
        return fieldValueService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        fieldValueService.deleteById(id);
    }

    @GetMapping("/")
    public List<FieldValue> findAll() {
        return fieldValueService.findAll();
    }



}
