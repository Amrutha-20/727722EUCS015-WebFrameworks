package com.example.pah1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pah1.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{
    
}
