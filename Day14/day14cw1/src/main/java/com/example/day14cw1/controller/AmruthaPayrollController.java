package com.example.day14cw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14cw1.model.AmruthaPayroll;
import com.example.day14cw1.service.AmruthaPayrollService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/employee")
public class AmruthaPayrollController {

    @Autowired
    private AmruthaPayrollService payrollService;

    @PostMapping("/{employeeId}/payroll")
    public ResponseEntity<AmruthaPayroll> createPayroll(@PathVariable Long employeeId, @RequestBody AmruthaPayroll payroll) {
        AmruthaPayroll createdPayroll = payrollService.createPayroll(employeeId, payroll);
        return new ResponseEntity<>(createdPayroll, HttpStatus.CREATED);
    }

    @GetMapping("/{employeeId}/payroll")
    public ResponseEntity<AmruthaPayroll> getPayrollByEmployeeId(@PathVariable Long employeeId) {
        AmruthaPayroll payroll = payrollService.getPayrollByEmployeeId(employeeId);
        if (payroll != null) {
            return new ResponseEntity<>(payroll, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
