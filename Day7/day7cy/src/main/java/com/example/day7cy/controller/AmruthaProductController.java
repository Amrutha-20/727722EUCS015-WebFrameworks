package com.examly.day7cy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.day7cy.model.AmruthaProduct;
import com.examly.day7cy.service.AmruthaProductService;

@RestController
public class AmruthaProductController {
    @Autowired
    AmruthaProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<AmruthaProduct> postMethod(@RequestBody AmruthaProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<AmruthaProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<AmruthaProduct>> dndcjk() {
        List<AmruthaProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<AmruthaProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<AmruthaProduct>> getbyid(@PathVariable String productCategory) {
        List<AmruthaProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<AmruthaProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<AmruthaProduct>> getbdyid(@PathVariable String priceCategory) {
        List<AmruthaProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<AmruthaProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
