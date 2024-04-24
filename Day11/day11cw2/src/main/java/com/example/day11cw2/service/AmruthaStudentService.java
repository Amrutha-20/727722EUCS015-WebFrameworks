package com.example.day11cw2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day11cw2.model.AmruthaStudent;
import com.example.day11cw2.repository.AmruthaStudentRepository;

@Service
public class AmruthaStudentService {
    public AmruthaStudentRepository studentRepository;
    public AmruthaStudentService(AmruthaStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public AmruthaStudent saveStudent(AmruthaStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AmruthaStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
