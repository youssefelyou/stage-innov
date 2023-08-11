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
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String namef;
    private String fieldid;
    private String type;

   /* @OneToMany(mappedBy = "field", fetch = FetchType.LAZY)
    //@JsonIgnore
    private List<FieldValue> fieldValueList;
*/
    @ManyToOne
    private Result result;
}
