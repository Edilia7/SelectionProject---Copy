package com.SelectionProject.SelectionProject.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int time;
    private int points;
    private String companyName;
    private int yearExperience;
    private String startDate;
    private String finalDate;
    private String descriptionWork;
}
