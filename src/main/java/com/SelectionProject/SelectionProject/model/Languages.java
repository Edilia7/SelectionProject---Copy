package com.SelectionProject.SelectionProject.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

@Data
@Entity
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private int level;
    @NotBlank
    private int listening;
    @NotBlank
    private int reading;
    @NotBlank
    private int writing;
    @NotBlank
    private int speaking;
    @NotBlank
    @Past
    private String date;
}
