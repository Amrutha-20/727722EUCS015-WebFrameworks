package com.example.day14cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14cw1.model.AmruthaPayroll;

@Repository
public interface AmruthaPayrollRepo extends JpaRepository<AmruthaPayroll, Long> {
}
