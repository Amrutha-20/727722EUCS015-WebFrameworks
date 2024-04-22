package com.example.day8cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day8cw1.model.AmruthaPerson;
import com.example.day8cw1.repository.AmruthaPersonRepo;

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

    public List<AmruthaPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AmruthaPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
