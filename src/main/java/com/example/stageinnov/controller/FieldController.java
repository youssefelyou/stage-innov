package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Field;
import com.example.stageinnov.service.FieldService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/field")
@CrossOrigin
public class FieldController {


    @Autowired
    private FieldService fieldService;

    @GetMapping("/all")
    public List<Field> findAll() {
        return fieldService.findAll();
    }

    @PostMapping("/save")
    public Field save(@RequestBody Field field) {
        return fieldService.save(field);
    }

    @GetMapping("/{id}")
    public Optional<Field> findById(@PathVariable Integer id) {
        return fieldService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        fieldService.deleteById(id);
    }

    @GetMapping("/result/{id}")
    public List<Field> findFieldsByResultId(@PathVariable int id) {
        return fieldService.findFieldsByResultId(id);
    }

}
