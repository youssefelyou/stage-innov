package com.example.stageinnov.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String note;
    private int rate;
    private Date commentDate;

    @ManyToOne
    @JsonIgnoreProperties({ "projetList","commentList"})
    private User user;
    @ManyToOne
    @JsonIgnoreProperties({ "user","images","resultList","commentList"})
    private Projet projet;

    @OneToMany
    private List<Result> resultList;
   // @ManyToOne
   // private Image image;


    @PrePersist
    public void prePersist() {
        commentDate = new Date();
    }
}
