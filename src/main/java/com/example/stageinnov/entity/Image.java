package com.example.stageinnov.entity;

import com.fasterxml.jackson.annotation.*;
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
    private String name;
    private String photo;
    private String description;
    private String Format;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties({ "images", "resultList"})

    private Projet projet;


}



/*
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
    private String name;
    private String photo;
    private String description;
    private String Format;
    @ManyToOne
    private Projet projet;


}
*/