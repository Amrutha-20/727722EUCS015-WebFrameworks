package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.AmruthaProduct;
import com.example.day5cw1.repository.AmruthaProductRepo;

@Service
public class AmruthaProductService {
    public AmruthaProductRepo productRepo;
    public AmruthaProductService(AmruthaProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(AmruthaProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AmruthaProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public AmruthaProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
