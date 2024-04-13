package com.example.cw_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cw_1.model.Medicine;
import com.example.cw_1.services.MedicineService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class MedicineController {

    private MedicineService medicineService;

    public MedicineController(MedicineService medicineService)
    {
        this.medicineService = medicineService;
    }
    @PostMapping("/api/medicine")
    public Medicine postMethodName(@RequestBody Medicine medicine) {
        
        return medicineService.saveMedicine(medicine)
       
    }

    @GetMapping("/api/medicines")
    public List<Medicine> getMethodName() {
        List<Medicine> list = medicineService.getMedicines();
        return list;

    }   
    
    @GetMapping("/api/medicine/{medicineId}")
    public Medicine getMedicineById(@PathVariable("medicineId") int id) {
        Medicine m =  medicineService.MedicineById(id);
        return m;
    }
    
    
}
