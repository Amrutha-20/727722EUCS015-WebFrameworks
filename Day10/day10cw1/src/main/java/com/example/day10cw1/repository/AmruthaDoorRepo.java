package com.example.day10cw1.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day10cw1.model.AmruthaDoor;

@Repository
public interface AmruthaDoorRepo extends JpaRepository<AmruthaDoor,Integer> {
   


    
    List<AmruthaDoor>findByColor(String color);


    List<AmruthaDoor>findByDoorType(String doorType);

   
    List<AmruthaDoor>findByDoorId(int doorId);

   

   

    
}