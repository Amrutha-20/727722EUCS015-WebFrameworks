package com.example.day14cw1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AmruthaPayroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payrollId;
    private double amount;
    private int noOfDaysWorked;
    public void setEmployee(AmruthaEmployee employee) {
       
        throw new UnsupportedOperationException("Unimplemented method 'setEmployee'");
    }

}
