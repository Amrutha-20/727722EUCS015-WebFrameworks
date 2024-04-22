package com.example.day8cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day8cw3.model.AmruthaStudent;
import java.util.List;


@Repository
public interface AmruthaStudentRepo extends JpaRepository<AmruthaStudent,Integer>{

    List<AmruthaStudent> findByMarksGreaterThan(int marks); 
    List<AmruthaStudent> findByMarksLessThan(int marks); 
}
