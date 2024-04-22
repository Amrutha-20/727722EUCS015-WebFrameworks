package com.example.day7cw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day7cw3.model.AmruthaDoor;
import com.example.day7cw3.repository.AmruthaDoorRepo;

@Service
public class AmruthaDoorService {
    @Autowired
    private AmruthaDoorRepo rep;

    public boolean post(AmruthaDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AmruthaDoor> getAll()
    {
        return rep.findAll();
    }

    public List<AmruthaDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<AmruthaDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
