package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Projet;
import com.example.stageinnov.service.ProjetService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projet")
@CrossOrigin
public class ProjetController {



    @Autowired
    private ProjetService projetService;

    @GetMapping("/all")
    public List<Projet> findAll() {
        return projetService.findAll();
    }

    @PostMapping("/save")
    public Projet save(@RequestBody Projet projet) {
        return projetService.save(projet);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id,@RequestBody Projet projetInfo) {
        projetService.update(id, projetInfo);
    }
    @GetMapping("/{id}")
    public Optional<Projet> findById(@PathVariable Integer id) {
        return projetService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        projetService.deleteById(id);
    }
}
