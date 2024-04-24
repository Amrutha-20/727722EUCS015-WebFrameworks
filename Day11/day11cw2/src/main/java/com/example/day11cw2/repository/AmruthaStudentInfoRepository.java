package com.example.day11cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day11cw2.model.AmruthaStudentInfo;

@Repository
public interface AmruthaStudentInfoRepository extends JpaRepository<AmruthaStudentInfo,Integer>{
    
}