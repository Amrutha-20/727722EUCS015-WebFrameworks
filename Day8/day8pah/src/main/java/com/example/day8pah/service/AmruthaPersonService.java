package com.example.day8pah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day8pah.model.AmruthaPerson;
import com.example.day8pah.repository.AmruthaPersonRepo;

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

    public List<AmruthaPerson> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<AmruthaPerson> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
