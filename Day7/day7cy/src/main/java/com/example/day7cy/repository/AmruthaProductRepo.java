package com.examly.day7cy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.day7cy.model.AmruthaProduct;

@Repository
public interface AmruthaProductRepo extends JpaRepository<AmruthaProduct, Integer> {

    public List<AmruthaProduct> findByProductCategory(String productCategory);
    public List<AmruthaProduct> findByPriceCategory(String priceCategory);

}
