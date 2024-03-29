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
public class StayCanada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private int time;
    @NotBlank
    @Past
    private String startdate;
    @NotBlank
    private String finaldate;
}
