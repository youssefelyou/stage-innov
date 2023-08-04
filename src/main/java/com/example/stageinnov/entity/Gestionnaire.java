package com.example.stageinnov.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Gestionnaire extends User {

   /* @OneToMany(mappedBy = "gestionnaire")
    @JsonIgnore
    private List<Projet> projetList;
    */

}
