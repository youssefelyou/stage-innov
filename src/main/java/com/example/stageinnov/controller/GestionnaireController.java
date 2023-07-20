package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Gestionnaire;
import com.example.stageinnov.service.GestionnaireService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gestionnaire")
public class GestionnaireController {

    @Autowired
    private GestionnaireService gestionnaireService;

    @GetMapping("/all")
    public List<Gestionnaire> findAll() {
        return gestionnaireService.findAll();
    }

    @PostMapping("/save")
    public Gestionnaire save(@RequestBody Gestionnaire gestionnaire) {
        return gestionnaireService.save(gestionnaire);
    }

    @GetMapping("/{id}")
    public Optional<Gestionnaire> findById(@PathVariable Integer id) {
        return gestionnaireService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        gestionnaireService.deleteById(id);
    }
}
