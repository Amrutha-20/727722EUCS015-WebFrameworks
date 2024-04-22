package com.example.day10cw1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day10cw1.model.AmruthaDoor;
import com.example.day10cw1.repository.AmruthaDoorRepo;

@Service

public class AmruthaDoorService {
    @Autowired
    AmruthaDoorRepo doorRepo;
    public AmruthaDoor postData(AmruthaDoor s)
    {
       return doorRepo.save(s);
    }
    public List<AmruthaDoor> getData()
    {
        return doorRepo.findAll();
    }
    public List<AmruthaDoor>getDataByColor(String color)
    {
        return doorRepo.findByColor(color);
    }
    public List<AmruthaDoor>getByType(String doorType)
    {
        return doorRepo.findByDoorType(doorType);
    }
    public List<AmruthaDoor>getById(int id)
    {
        return doorRepo.findByDoorId(id);
    }
    public AmruthaDoor updateData(int doorId,String color)
    {
        AmruthaDoor exist=doorRepo.findById(doorId).orElse(null);
        if(exist!=null)
        {
            exist.setColor(color);
            return doorRepo.saveAndFlush(exist);

        }
        else
         return null;
    }
    public String deldata(int id)
    {
        doorRepo.deleteById(id);
        return("Door deleted succesfully");
    }
}