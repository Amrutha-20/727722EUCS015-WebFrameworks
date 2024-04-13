package com.example.day5cw2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw2.model.Employee;
import com.example.day5cw2.service.EmployeeService;

@RestController
public class EmployeeController {
    public EmployeeService employeeService;
    public EmployeeController( EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public Employee postMethodName(@RequestBody Employee employee) {
       employeeService.saveEmployee(employee);
       return employee;
        
    }

    @PutMapping("/api/employee/{employeeId}")
    public Employee putMethodName(@PathVariable("employeeId") int id, @RequestBody Employee employee) {
        employeeService.updateDetails(id,employee);
        return employee;
        
    }
    
    @DeleteMapping("/api/employee/{employeeId}")
    public Employee delete(@PathVariable("employeeId") int id,@RequestBody Employee employee)
    {
        employeeService.deleteEmployee(id);
        return employee;
    }
}
