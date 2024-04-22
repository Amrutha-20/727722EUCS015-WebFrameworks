package com.example.day9cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.day9cw3.model.AmruthaVillage;
import java.util.List;

@Repository
public interface AmruthaVillageRepo extends JpaRepository<AmruthaVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    AmruthaVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    AmruthaVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<AmruthaVillage> findByPopulation(int population);

}
