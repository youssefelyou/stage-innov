package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Projet;
import com.example.stageinnov.entity.Role;
import com.example.stageinnov.service.ProjetService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projet")
@CrossOrigin
public class ProjetController {


    @GetMapping("/between/{dateStart}/{dateEnd}")
    public List<Projet> findByDateCreationBetween(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateStart, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateEnd) {
        return projetService.findByDateCreationBetween(dateStart, dateEnd);
    }

    @GetMapping("/role/{role}")
    public List<Projet> findByUserRole(@PathVariable Role role) {
        return projetService.findByUserRole(role);
    }

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
