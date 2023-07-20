package com.example.stageinnov.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Client extends User{

    @OneToMany
    private List<Comment> comments;
}
