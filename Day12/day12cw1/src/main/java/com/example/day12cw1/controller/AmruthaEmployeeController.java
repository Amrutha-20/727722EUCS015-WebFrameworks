package com.example.day12cw1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12cw1.service.AmruthaEmployeeService;
import com.example.day12cw1.model.AmruthaEmployee;
@RestController
@RequestMapping("/employees")
public class AmruthaEmployeeController {

     private final AmruthaEmployeeService employeeService;

    @Autowired
    public AmruthaEmployeeController(AmruthaEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/inner-join")
    public ResponseEntity<List<AmruthaEmployee>> getEmployeesInnerJoin() {
        List<AmruthaEmployee> employees = employeeService.getEmployeesInnerJoin();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/left-outer-join")
    public ResponseEntity<List<AmruthaEmployee>> getEmployeesLeftOuterJoin() {
        List<AmruthaEmployee> employees = employeeService.getEmployeesLeftOuterJoin();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
