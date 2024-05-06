package com.student.student.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Student {
    @Id
    private int id;
    private String Name;
    private int Age;
    private String Address;
    private String Department;
    
}
