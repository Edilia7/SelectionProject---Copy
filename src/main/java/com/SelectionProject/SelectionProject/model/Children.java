package com.SelectionProject.SelectionProject.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private Person child;
}
