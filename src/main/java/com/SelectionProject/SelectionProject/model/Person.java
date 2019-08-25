package com.SelectionProject.SelectionProject.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String firstName;
    private String middleName;
    @NotBlank
    private String familytName;
    private Age age;
    @NotBlank
    private String cityBirth;
    @NotBlank
    private String provinceBirth;
    @NotBlank
    private String countryBirth;
    @NotBlank
    private String nacionality;
    @NotBlank
    private String sex;
    @NotBlank
    private double height;
    @NotBlank
    private String eyeColor;
    private CivilStatus civilStatus;
    private ContactInformation address;
    private ContactInformation telephone;
}
