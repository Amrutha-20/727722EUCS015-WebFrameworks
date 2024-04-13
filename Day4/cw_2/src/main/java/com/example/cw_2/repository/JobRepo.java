package com.example.cw_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cw_2.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job,Integer>{
    
}
