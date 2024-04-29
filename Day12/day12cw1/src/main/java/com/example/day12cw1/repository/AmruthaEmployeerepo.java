package com.example.day12cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day12cw1.model.AmruthaEmployee;

@Repository
public interface AmruthaEmployeerepo extends JpaRepository<AmruthaEmployee,Integer>{

    
}
