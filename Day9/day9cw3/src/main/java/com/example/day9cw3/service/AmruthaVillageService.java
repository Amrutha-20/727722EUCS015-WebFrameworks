package com.example.day9cw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day9cw3.model.AmruthaVillage;
import com.example.day9cw3.repository.AmruthaVillageRepo;

@Service
public class AmruthaVillageService {
    @Autowired
    private AmruthaVillageRepo rep;

    public boolean post(AmruthaVillage person)
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

    public AmruthaVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public AmruthaVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<AmruthaVillage> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
