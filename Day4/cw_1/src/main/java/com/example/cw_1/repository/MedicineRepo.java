package com.example.cw_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cw_1.model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine,Integer>{
    
}
