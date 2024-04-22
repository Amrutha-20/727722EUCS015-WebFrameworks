package com.example.day7cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day7cw2.model.AmruthaCourse;
import java.util.List;


@Repository
public interface AmruthaCourseRepo extends JpaRepository<AmruthaCourse,Integer>{

    List<AmruthaCourse> findByCourseName(String courseName);
    
}
