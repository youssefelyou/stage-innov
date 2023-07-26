package com.example.stageinnov.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @Column(length =5000000)
    private String photo;
    private String description;
    private String format;
    @ManyToOne
    private Projet projet;


}
