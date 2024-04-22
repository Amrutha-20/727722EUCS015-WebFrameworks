package com.example.day10pah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day10pah.model.AmruthaProduct;
import com.example.day10pah.repository.AmruthaProductRepo;

@Service
public class AmruthaProductService {
    @Autowired
    private AmruthaProductRepo productRepo;

    public boolean saveProduct(AmruthaProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<AmruthaProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public AmruthaProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public AmruthaProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}