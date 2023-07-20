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
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String note;
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne
    private Client client;
    @OneToMany
    private List<Result> resultList;
}
