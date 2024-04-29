package com.example.day12cw2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class AmruthaStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_detail_id", referencedColumnName = "id")
    private AmruthaStudentDetail studentDetail;
}
