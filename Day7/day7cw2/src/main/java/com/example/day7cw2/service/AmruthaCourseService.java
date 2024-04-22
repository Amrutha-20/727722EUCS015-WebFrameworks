package com.example.day7cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day7cw2.model.AmruthaCourse;
import com.example.day7cw2.repository.AmruthaCourseRepo;

@Service
public class AmruthaCourseService {
    @Autowired
    private AmruthaCourseRepo rep;

    public boolean post(AmruthaCourse person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AmruthaCourse> getAll()
    {
        return rep.findAll();
    }

    public List<AmruthaCourse> getbyAge(String courseName)
    {
        return rep.findByCourseName(courseName);
    }
    
}
