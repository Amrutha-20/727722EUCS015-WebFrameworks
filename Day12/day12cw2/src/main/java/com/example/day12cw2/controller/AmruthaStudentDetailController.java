package com.example.day12cw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12cw2.model.AmruthaStudentDetail;
import com.example.day12cw2.service.AmruthaStudentDetailService;



@RestController
public class AmruthaStudentDetailController {
    @Autowired
    AmruthaStudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<AmruthaStudentDetail> addStudentDetails(@PathVariable int id,@RequestBody StudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
