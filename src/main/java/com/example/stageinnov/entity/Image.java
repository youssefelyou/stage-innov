package com.example.stageinnov.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String photo;
    private String description;
    private String Format;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties({ "images", "resultList","user","commentList"})
    private Projet projet;

    /*
    @OneToMany(mappedBy = "image", fetch = FetchType.LAZY)
    private List<Comment> commentList;
*/
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