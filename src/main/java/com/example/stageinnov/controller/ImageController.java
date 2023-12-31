package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Image;
import com.example.stageinnov.service.ImageService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/image")
@CrossOrigin
public class ImageController {



    @Autowired
    private ImageService imageService;

    @GetMapping("/all")
    public List<Image> findAll() {
        return imageService.findAll();
    }

    @PostMapping("/save")
    public Image save(@RequestBody Image image) {
        return imageService.save(image);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id,@RequestBody Image imageInfo) {
        imageService.update(id, imageInfo);
    }
    @GetMapping("/{id}")
    public Optional<Image> findById(@PathVariable Integer id) {
        return imageService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        imageService.deleteById(id);
    }
}
