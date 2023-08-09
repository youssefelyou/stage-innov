package com.example.stageinnov.service;

import com.example.stageinnov.entity.Projet;
import com.example.stageinnov.entity.Result;
import com.example.stageinnov.repository.ResultRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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


    public void update(Integer id, Result resultInfo) {
        Result result=resultRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("result not found with id " + id));
        result.setName(resultInfo.getName());
        result.setDescription(resultInfo.getDescription());
        result.setFile(resultInfo.getFile());
        result.setType(resultInfo.getType());
        resultRepository.save(result);
    }
    @Transactional
    public void deleteById(Integer id) {
        resultRepository.deleteById(id);
    }
}
