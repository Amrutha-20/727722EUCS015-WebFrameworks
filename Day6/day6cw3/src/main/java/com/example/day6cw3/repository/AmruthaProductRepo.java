package com.example.day6cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.model.AmruthaProduct;

@Repository
public interface AmruthaProductRepo extends JpaRepository<AmruthaProduct,Integer>{
    
}