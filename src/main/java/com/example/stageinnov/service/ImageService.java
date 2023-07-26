package com.example.stageinnov.service;

import com.example.stageinnov.entity.Image;
import com.example.stageinnov.entity.Projet;
import com.example.stageinnov.repository.ImageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    public Image save(Image image) {
        return imageRepository.save(image);
    }

    public void update(Integer id, Image imageInfo) {
        Image image=imageRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ville not found with id " + id));
        image.setDescription(imageInfo.getDescription());
        image.setName(imageInfo.getName());
        image.setPhoto(imageInfo.getPhoto());
        image.setFormat(imageInfo.getFormat());
        image.setProjet(imageInfo.getProjet());
        imageRepository.save(image);
    }
    public Optional<Image> findById(Integer id) {
        return imageRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        imageRepository.deleteById(id);
    }
}
