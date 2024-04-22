package com.example.day9cw1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.day9cw1.model.AmruthaPerson;

public interface AmruthaPersonRepo extends JpaRepository<AmruthaPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<AmruthaPerson> findByAge(int age);
}
