package com.example.day10cw2.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day10cw2.model.AmruthaCustomer;

@Repository
public interface AmruthaCustomerRepo extends JpaRepository<AmruthaCustomer,Integer> {

    List<AmruthaCustomer> findByCity(String City);
    
}