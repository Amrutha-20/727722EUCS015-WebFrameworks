package com.example.day13cw2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day13cw2.model.AmruthaStudent;

@Repository
public interface AmruthaStudentRepo extends JpaRepository<AmruthaStudent, Integer> {

    List<AmruthaStudent> findByDepartmentDepartmentId(int departmentId);
}
