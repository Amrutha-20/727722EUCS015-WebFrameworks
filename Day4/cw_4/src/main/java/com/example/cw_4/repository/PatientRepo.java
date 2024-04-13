package com.example.cw_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cw_4.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{
    
}
