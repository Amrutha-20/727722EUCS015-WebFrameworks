package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.AmruthaProduct;
import com.example.day6cw3.repository.AmruthaProductRepo;

@Service
public class AmruthaProductService {
    public AmruthaProductRepo productRepo;
    public AmruthaProductService(AmruthaProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AmruthaProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AmruthaProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AmruthaProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AmruthaProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
