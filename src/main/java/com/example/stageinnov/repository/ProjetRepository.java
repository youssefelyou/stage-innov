package com.example.stageinnov.repository;

import com.example.stageinnov.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Integer> {
    List<Projet> findByDateCreationBetween(Date dateStart,Date dateEnd);
}
