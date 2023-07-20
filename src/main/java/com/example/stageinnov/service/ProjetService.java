package com.example.stageinnov.service;

import com.example.stageinnov.repository.ProjetRepository;
import com.example.stageinnov.entity.Projet;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    public List<Projet> findAll() {
        return projetRepository.findAll();
    }

    public Projet save(Projet projet) {
        return projetRepository.save(projet);
    }

    public Optional<Projet> findById(Integer id) {
        return projetRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        projetRepository.deleteById(id);
    }
}
