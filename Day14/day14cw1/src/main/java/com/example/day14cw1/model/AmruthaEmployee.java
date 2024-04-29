package com.example.day14cw1.model;

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
public class AmruthaEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long employeeId;
        private String employeeName;
        private int age;
        private long mobile;
    
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "payroll_id", referencedColumnName = "payrollId")
        private AmruthaPayroll payroll;
    
        
    
    
}


