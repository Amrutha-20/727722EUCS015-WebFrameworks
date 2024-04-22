package com.example.day9cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day9cw2.model.AmruthaRecipe;
import com.example.day9cw2.repository.AmruthaRecipeRepo;

@Service
public class AmruthaRecipeService {
    @Autowired
    private AmruthaRecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(AmruthaRecipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public AmruthaRecipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<AmruthaRecipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
