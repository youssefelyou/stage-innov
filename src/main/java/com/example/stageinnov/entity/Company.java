package com.example.stageinnov.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String fax;
    private String webSite;
    private String logo;
    private String valIds;
    private String valRc;
    private String valPatente;
    private String valIf;
    private String valCnss;
    private String valIce;




}
