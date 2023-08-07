package com.example.stageinnov.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private String file;
    private String description;
    @ManyToOne
    private Projet projet;
    @OneToMany
    private List<Field> fieldList;
}
