package com.example.day14cw1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14cw1.model.AmruthaEmployee;
import com.example.day14cw1.repository.AmruthaEmployeeRepo;

@Service
public class AmruthaEmployeeService {

    @Autowired
    private AmruthaEmployeeRepo employeeRepo;

    public AmruthaEmployee createEmployee(AmruthaEmployee employee) {
        return employeeRepo.save(employee);
    }

    public Iterable<AmruthaEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public AmruthaEmployee getEmployeeById(Long employeeId) {
        return employeeRepo.findById(employeeId).orElse(null);
    }
}

