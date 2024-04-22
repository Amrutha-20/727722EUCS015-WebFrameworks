package com.example.day8cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day8cw2.model.AmruthaProduct;
import com.example.day8cw2.repository.AmruthaProductRepo;

@Service
public class AmruthaProductService {
    @Autowired
    private AmruthaProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(AmruthaProduct person)
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

    public List<AmruthaProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<AmruthaProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<AmruthaProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
