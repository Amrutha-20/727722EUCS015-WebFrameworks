package com.example.day11cw2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day11cw2.model.AmruthaStudent;
import com.example.day11cw2.service.AmruthaStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AmruthaStudentController {
    public AmruthaStudentService studentService;
    public AmruthaStudentController(AmruthaStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AmruthaStudent postMethodName(@RequestBody AmruthaStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AmruthaStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
