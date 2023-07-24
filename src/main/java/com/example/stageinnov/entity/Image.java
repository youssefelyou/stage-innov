package com.example.stageinnov.entity;

import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String img;
    private String description;
    private String Format;
    @ManyToOne
    private Projet projet;
    @ManyToOne
    private User user;


}
