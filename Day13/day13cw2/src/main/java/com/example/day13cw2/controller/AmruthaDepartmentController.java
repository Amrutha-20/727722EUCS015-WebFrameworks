package com.example.day13cw2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.day13cw2.model.AmruthaDepartment;
import com.example.day13cw2.service.AmruthaDepartmentService;

import java.util.List;

@RestController
public class AmruthaDepartmentController {

    @Autowired
    private AmruthaDepartmentService departmentService;

    @PostMapping("/department")
    public ResponseEntity<AmruthaDepartment> createDepartment(@RequestBody AmruthaDepartment department) {
        AmruthaDepartment createdDepartment = departmentService.createDepartment(department);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/department")
    public ResponseEntity<List<AmruthaDepartment>> getAllDepartments() {
        List<AmruthaDepartment> departments = departmentService.getAllDepartments();
        if (departments.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
}
