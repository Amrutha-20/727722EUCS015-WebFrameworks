package com.example.day13cw2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.day13cw2.model.AmruthaDepartment;
import com.example.day13cw2.model.AmruthaStudent;
import com.example.day13cw2.service.AmruthaStudentService;

import java.util.List;

@RestController
public class AmruthaStudentController {

    @Autowired
    private AmruthaStudentService studentService;

    @PostMapping("/department/{departmentId}/student")
    public ResponseEntity<AmruthaStudent> createStudent(@PathVariable int departmentId, @RequestBody AmruthaStudent student) {
        // Assuming student has department information included in the request body
        AmruthaDepartment department = new AmruthaDepartment();
        department.setDepartmentId(departmentId);
        student.setDepartment(department);
        
        AmruthaStudent createdStudent = studentService.createStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @GetMapping("/department/{departmentId}/student")
    public ResponseEntity<List<AmruthaStudent>> getStudentsByDepartmentId(@PathVariable int departmentId) {
        List<AmruthaStudent> students = studentService.getStudentsByDepartmentId(departmentId);
        if (students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/department/student")
    public ResponseEntity<List<AmruthaStudent>> getAllStudents() {
        List<AmruthaStudent> students = studentService.getAllStudents();
        if (students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/department/student/{studentId}")
    public ResponseEntity<AmruthaStudent> getStudentById(@PathVariable int studentId) {
        AmruthaStudent student = studentService.getStudentById(studentId);
        if (student == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
