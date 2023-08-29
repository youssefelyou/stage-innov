package com.example.stageinnov.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String file;
    private String description;


    @OneToMany(mappedBy = "result", fetch = FetchType.LAZY)
    private List<Field> fieldList;

    @OneToMany(mappedBy = "result", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Projet> projetList;
}
