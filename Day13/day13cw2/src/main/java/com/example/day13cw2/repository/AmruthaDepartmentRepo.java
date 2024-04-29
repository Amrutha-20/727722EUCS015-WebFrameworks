package com.example.day13cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day13cw2.model.AmruthaDepartment;
@Repository
public interface AmruthaDepartmentRepo extends JpaRepository<AmruthaDepartment, Integer> {
    
}
