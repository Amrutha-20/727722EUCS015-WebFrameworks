package com.example.day11cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day11cw1.model.AmruthaStudent;



@Repository
public interface AmruthaStudentRepository extends JpaRepository<AmruthaStudent,Integer>{
    
}
