package com.example.stageinnov.service;

import com.example.stageinnov.entity.Gestionnaire;
import com.example.stageinnov.repository.GestionnaireRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestionnaireService {
    
    @Autowired
    private GestionnaireRepository gestionnaireRepository;

    public List<Gestionnaire> findAll() {
        return gestionnaireRepository.findAll();
    }

    public Gestionnaire save(Gestionnaire gestionnaire) {
        return gestionnaireRepository.save(gestionnaire);
    }

    public Optional<Gestionnaire> findById(Integer id) {
        return gestionnaireRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        gestionnaireRepository.deleteById(id);
    }
}
