package com.examly.day7cy.service;

import com.examly.day7cy.model.AmruthaProduct;
import com.examly.day7cy.repository.AmruthaProductRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AmruthaProductService {
    @Autowired
    AmruthaProductRepo repo;

    @SuppressWarnings("null")
    public boolean post(AmruthaProduct c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AmruthaProduct> getAll() {
        return repo.findAll();

    }

    public List<AmruthaProduct> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<AmruthaProduct> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}
