package com.example.day8cw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day8cw3.model.AmruthaStudent;
import com.example.day8cw3.repository.AmruthaStudentRepo;

@Service
public class AmruthaStudentService {
    @Autowired
    private AmruthaStudentRepo studentRepo;

    public boolean post(AmruthaStudent student)
    {
        try
        {
            studentRepo.save(student);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AmruthaStudent> getAll()
    {
        return studentRepo.findAll();
    }

    public List<AmruthaStudent> getGreater(int marks)
    {
        return studentRepo.findByMarksGreaterThan(marks);
    }

    public List<AmruthaStudent> getLesser(int marks)
    {
        return studentRepo.findByMarksLessThan(marks);
    }
    
}
