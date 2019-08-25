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
public class EducationTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String trainingArea;
    @NotBlank
    private String courseName;
    @NotBlank
    private String institution;
    @NotBlank
    @Past
    private String startDate;
    @NotBlank
    @Past
    private String finalDate;
    @NotBlank
    private String city;
    @NotBlank
    private String country;
}
