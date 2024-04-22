package com.example.day7pah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Service;

import com.example.day7pah.model.AmruthaCar;
import com.example.day7pah.repository.AmruthaCarRepo;

@Service
public class AmruthaCarService {
    @Autowired
    private AmruthaCarRepo carRepo;

    public boolean post(AmruthaCar car)
    {
        try
        {
            carRepo.save(car);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AmruthaCar> getAll()
    {
        return carRepo.findAll();
    }

    public AmruthaCar getByDetails(String currentOwnerName, String address)
    {
        try{
        return carRepo.findDistinctBycurrentOwnerNameAndAddress(currentOwnerName, address);
        }
        catch(IncorrectResultSizeDataAccessException i)
        {
            System.out.println("\n\n"+i+"\n\nUse List if needed");
            return null;
        }
        catch(Exception e)
        {
            System.out.println("\n\n"+e);
            return null;
        }
    }
    
}
