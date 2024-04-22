package com.example.day8cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day8cw2.model.AmruthaProduct;
import java.util.List;


@Repository
public interface AmruthaProductRepo extends JpaRepository<AmruthaProduct,Integer>{

    List<AmruthaProduct> findByProductNameStartingWith(String name);
    List<AmruthaProduct> findByProductNameEndingWith(String name);
    
}
