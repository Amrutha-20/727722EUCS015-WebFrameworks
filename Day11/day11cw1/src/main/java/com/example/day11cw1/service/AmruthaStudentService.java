package com.example.day11cw1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day11cw1.model.AmruthaStudent;
import com.example.day11cw1.model.AmruthaStudentInfo;
import com.example.day11cw1.repository.AmruthaStudentInfoRepository;
import com.example.day11cw1.repository.AmruthaStudentRepository;

@Service
public class AmruthaStudentService {
    public AmruthaStudentRepository studentRepository;
    public AmruthaStudentInfoRepository studentInfoRepository;
    public AmruthaStudentService(AmruthaStudentRepository studentRepository,AmruthaStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AmruthaStudent saveStudent(AmruthaStudent student)
    {
        return studentRepository.save(student);
    }
    public AmruthaStudentInfo saveStudentInfo(AmruthaStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AmruthaStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
