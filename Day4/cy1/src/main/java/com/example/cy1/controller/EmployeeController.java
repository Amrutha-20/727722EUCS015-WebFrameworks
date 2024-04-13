package com.example.cy1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cy1.model.Employee;
import com.example.cy1.service.EmployeeService;

@RestController
public class EmployeeController {
    public EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public Employee postMethodName(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @GetMapping("/api/employee")
    public List<Employee>getMethodName() {
        List<Employee> list =  employeeService.getEmployees();
        return  list;
    }
    
    @GetMapping("/api/employee/{employeeId}")
    public Employee getMethodName(@PathVariable("employeeId") int id) {
        Employee p =  employeeService.getEmployeeById(id);
        return p;
    }
}
