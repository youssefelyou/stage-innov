package com.example.stageinnov.service;

import com.example.stageinnov.entity.Image;
import com.example.stageinnov.repository.ImageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Optional<Image> findById(Integer id) {
        return imageRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        imageRepository.deleteById(id);
    }
}
