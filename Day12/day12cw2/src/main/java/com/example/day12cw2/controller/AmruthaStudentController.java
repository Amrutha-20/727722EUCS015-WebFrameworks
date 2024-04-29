package com.example.day12cw2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day12cw2.model.AmruthaStudent;
import com.example.day12cw2.service.AmruthaStudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AmruthaStudentController{
    @Autowired
    AmruthaStudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<AmruthaStudent> addStudents(@RequestBody AmruthaStudent student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<AmruthaStudent>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<AmruthaStudent>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


