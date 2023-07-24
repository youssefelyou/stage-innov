package com.example.stageinnov.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date dateCreation;
    private String description;
    @OneToMany
    private List<Image> images;
    @ManyToOne
    @JoinColumn(name = "gestionnaire_id")
    private Gestionnaire gestionnaire;
    @OneToMany
    private List<Result> resultList;
}
