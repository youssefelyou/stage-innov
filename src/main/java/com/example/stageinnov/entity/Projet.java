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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(mappedBy = "projet", fetch = FetchType.LAZY)
    private List<Image> images;

    @ManyToOne
    private Result result;

    @OneToMany(mappedBy = "projet", fetch = FetchType.LAZY)
    private List<Comment> commentList;

    @PrePersist
    public void prePersist() {
        dateCreation = new Date();
    }
}
