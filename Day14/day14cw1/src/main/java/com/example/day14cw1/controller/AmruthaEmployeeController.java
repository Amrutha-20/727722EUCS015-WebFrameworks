package com.example.day14cw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14cw1.model.AmruthaEmployee;
import com.example.day14cw1.service.AmruthaEmployeeService;

@RestController
@RequestMapping("/employee")
public class AmruthaEmployeeController {

    @Autowired
    private AmruthaEmployeeService employeeService;

    @PostMapping
    public ResponseEntity<AmruthaEmployee> createEmployee(@RequestBody AmruthaEmployee employee) {
        AmruthaEmployee createdEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<AmruthaEmployee>> getAllEmployees() {
        Iterable<AmruthaEmployee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<AmruthaEmployee> getEmployeeById(@PathVariable Long employeeId) {
        AmruthaEmployee employee = employeeService.getEmployeeById(employeeId);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

