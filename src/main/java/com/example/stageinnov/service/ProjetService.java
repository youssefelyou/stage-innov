package com.example.stageinnov.service;

import com.example.stageinnov.repository.ProjetRepository;
import com.example.stageinnov.entity.Projet;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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

    public void update(Integer id,Projet projetInfo) {
        Projet projet=projetRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ville not found with id " + id));
        projet.setName(projetInfo.getName());
        projet.setDescription(projetInfo.getDescription());
        projetRepository.save(projet);
    }

    @Transactional
    public void deleteById(Integer id) {
        projetRepository.deleteById(id);
    }
}
