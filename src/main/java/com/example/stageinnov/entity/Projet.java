package com.example.stageinnov.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToMany(mappedBy = "projet", fetch = FetchType.LAZY)
    private List<Image> images;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany
    //@JsonIgnore
    private List<Result> resultList;

    @PrePersist
    public void prePersist() {
        dateCreation = new Date();
    }
}
/*package com.example.stageinnov.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<Image> images;
    @ManyToOne
    @JoinColumn(name = "gestionnaire_id")
    private Gestionnaire gestionnaire;
    @OneToMany
    private List<Result> resultList;

    @PrePersist
    public void prePersist() {
        dateCreation = new Date();
    }
}
*/