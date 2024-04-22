package com.example.day8pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day8pah.model.AmruthaPerson;
import java.util.List;


@Repository
public interface AmruthaPersonRepo extends JpaRepository<AmruthaPerson,Integer>{

    List<AmruthaPerson> findByLastnameNot(String lastname);
    List<AmruthaPerson> findByAgeNotIn(List<Integer> ages);
    
}
