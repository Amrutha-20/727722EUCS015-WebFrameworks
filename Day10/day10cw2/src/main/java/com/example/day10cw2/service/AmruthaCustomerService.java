package com.example.day10cw2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.day10cw2.model.AmruthaCustomer;
import com.example.day10cw2.repository.AmruthaCustomerRepo;

@Service
public class AmruthaCustomerService {
    @Autowired
    AmruthaCustomerRepo customerRepo;
    public AmruthaCustomer postData(AmruthaCustomer c)
    {
        return customerRepo.save(c);
    }
    public List<AmruthaCustomer> getByCity(String city)
    {
        return customerRepo.findByCity(city);
    }
    public List<AmruthaCustomer> getData()
    {
        return customerRepo.findAll();
    }
    public Optional<AmruthaCustomer> getById(int id){
        return customerRepo.findById(id);
    }
    public AmruthaCustomer updateData(int id,int pincode)
    {
        AmruthaCustomer exist=customerRepo.findById(id).orElse(null);
        if(exist!=null)
        {
            exist.setPincode(pincode);
            return customerRepo.saveAndFlush(exist);

        }
        else
         return null;
    }
    public String deleteData(int id)
    {
        customerRepo.deleteById(id);
        return ("Customer deleted successfully.");
    }

}
