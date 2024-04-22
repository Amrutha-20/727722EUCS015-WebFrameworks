package com.example.day7cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day7cw3.model.AmruthaDoor;
import java.util.List;

@Repository
public interface AmruthaDoorRepo extends JpaRepository<AmruthaDoor,Integer>{

    List<AmruthaDoor> findByDoorId(int doorId);
    List<AmruthaDoor> findByAccessType(String accessType);
    
}
