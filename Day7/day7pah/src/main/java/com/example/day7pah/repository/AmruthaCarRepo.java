package com.example.day7pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day7pah.model.AmruthaCar;


@Repository
public interface AmruthaCarRepo extends JpaRepository<AmruthaCar,Integer>{

    AmruthaCar findDistinctBycurrentOwnerNameAndAddress(String currentOwnerName, String address); 
}
