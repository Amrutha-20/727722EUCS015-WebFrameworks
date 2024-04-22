package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.model.AmruthaEmployee;
import com.example.day5cw2.repository.AmruthaEmployeeRepo;

@Service
public class AmruthaEmployeeService {
    public AmruthaEmployeeRepo employeeRepo;
    public AmruthaEmployeeService(AmruthaEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(AmruthaEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AmruthaEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public AmruthaEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
