package com.example.day12cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12cw2.model.AmruthaStudent;
import com.example.day12cw2.repository.AmruthaStudentrepo;



@Service
public class AmruthaStudentService {
    @Autowired
    AmruthaStudentrepo studentRepository;
    public AmruthaStudent addStudents( AmruthaStudent student)
    {
        return studentRepository.save(student);
    }
    public List< AmruthaStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List< AmruthaStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List< AmruthaStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
