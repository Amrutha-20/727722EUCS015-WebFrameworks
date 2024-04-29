package com.example.day13cw2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day13cw2.model.AmruthaStudent;
import com.example.day13cw2.repository.AmruthaStudentRepo;

import java.util.List;

@Service
public class AmruthaStudentService {

    @Autowired
    private AmruthaStudentRepo studentRepo;

    public List<AmruthaStudent> getAllStudents() {
        return studentRepo.findAll();
    }

    public AmruthaStudent createStudent(AmruthaStudent student) {
        return studentRepo.save(student);
    }

    public List<AmruthaStudent> getStudentsByDepartmentId(int departmentId) {
        return studentRepo.findByDepartmentDepartmentId(departmentId);
    }

    public AmruthaStudent getStudentById(int studentId) {
        return studentRepo.findById(studentId).orElse(null);
    }
}
