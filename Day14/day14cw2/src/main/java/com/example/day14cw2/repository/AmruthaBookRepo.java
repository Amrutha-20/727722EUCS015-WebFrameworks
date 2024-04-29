package com.example.day14cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14cw2.model.AmruthaBook;

@Repository
public interface AmruthaBookRepo extends JpaRepository<AmruthaBook,Integer> {
    
}
