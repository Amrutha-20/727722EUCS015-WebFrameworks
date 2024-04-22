package com.example.day5cw2.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw2.model.AmruthaEmployee;
import com.example.day5cw2.service.AmruthaEmployeeService;

@RestController
public class AmruthaEmployeeController {
    public AmruthaEmployeeService employeeService;
    public AmruthaEmployeeController( AmruthaEmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public AmruthaEmployee postMethodName(@RequestBody AmruthaEmployee employee) {
       employeeService.saveEmployee(employee);
       return employee;
        
    }

    @PutMapping("/api/employee/{employeeId}")
    public AmruthaEmployee putMethodName(@PathVariable("employeeId") int id, @RequestBody AmruthaEmployee employee) {
        employeeService.updateDetails(id,employee);
        return employee;
        
    }
    
    @DeleteMapping("/api/employee/{employeeId}")
    public AmruthaEmployee delete(@PathVariable("employeeId") int id,@RequestBody AmruthaEmployee employee)
    {
        employeeService.deleteEmployee(id);
        return employee;
    }
}
