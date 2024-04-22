package com.example.day7cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day7cw1.model.AmruthaPerson;
import com.example.day7cw1.repository.AmruthaPersonRepo;

@Service
public class AmruthaPersonService {
    @Autowired
    private AmruthaPersonRepo rep;

    public boolean post(AmruthaPerson person)
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

    public List<Person> getAll()
    {
        return rep.findAll();
    }

    public List<Person> getbyAge(int age)
    {
        return rep.findByAge(age);
    }
    
}
