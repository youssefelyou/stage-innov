package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Result;
import com.example.stageinnov.service.ResultService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/result")
@CrossOrigin
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/all")
    public List<Result> findAll() {
        return resultService.findAll();
    }

    @PostMapping("/save")
    public Result save(@RequestBody Result result) {
        return resultService.save(result);
    }

    @GetMapping("/{id}")
    public Optional<Result> findById(@PathVariable Integer id) {
        return resultService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        resultService.deleteById(id);
    }
}
