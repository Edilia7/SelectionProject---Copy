package com.SelectionProject.SelectionProject.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Age {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String bornDate;
    @NotBlank
    private int age;
    @NotBlank
    private int points;

    public int getAge(){
        if(age >= 18 && age <= 35){
            points = 16;
        }else if(age == 36){
            points = 14;
        }else if(age == 37){
            points = 12;
        }else if(age == 38){
            points = 10;
        }else if(age == 39){
            points = 8;
        }else if(age == 40){
            points = 6;
        }else if(age == 41){
            points = 4;
        }else if(age == 42){
            points = 2;
        }else if(age >= 43){
            points = 0;
        }else{
            System.out.println("If you are under 18 years old you can not apply");
            System.exit(0);
        }
        return points;
    }
}
