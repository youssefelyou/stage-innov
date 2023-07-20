package com.example.stageinnov.service;

import com.example.stageinnov.entity.Result;
import com.example.stageinnov.repository.ResultRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultService {
    @Autowired
    private ResultRepository resultRepository;

    public List<Result> findAll() {
        return resultRepository.findAll();
    }

    public Result save(Result result) {
        return resultRepository.save(result);
    }

    public Optional<Result> findById(Integer id) {
        return resultRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        resultRepository.deleteById(id);
    }
}
