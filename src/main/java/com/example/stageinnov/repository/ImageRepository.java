package com.example.stageinnov.repository;

import com.example.stageinnov.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Integer> {
}
