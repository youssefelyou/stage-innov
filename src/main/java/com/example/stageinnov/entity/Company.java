package com.example.stageinnov.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String address;
    private String phone;
    private String email;
    private String fax;
    private String webSite;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String logo;
    private String valRc;
    private String valPatente;
    private String valIf;
    private String valCnss;
    private String valIce;




}
