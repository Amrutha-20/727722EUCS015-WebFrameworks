package com.example.day13cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day13cw1.model.AmruthaBook;
@Repository
public interface AmruthaBookRepository extends JpaRepository<AmruthaBook, Long> {
}
