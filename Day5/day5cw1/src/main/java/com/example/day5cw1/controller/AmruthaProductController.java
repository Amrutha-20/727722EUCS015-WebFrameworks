package com.example.day5cw1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw1.model.AmruthaProduct;
import com.example.day5cw1.service.AmruthaProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class AmruthaProductController {
    public AmruthaProductService productService;
    public AmruthaProductController(AmruthaProductService productService)
    {
        this.productService = productService;
    }
    @PostMapping("/api/product")
    public AmruthaProduct postMethodName(@RequestBody AmruthaProduct product) {
        productService.saveProduct(product);
        return product;
       
    }

    @PutMapping("/api/product/{productId}")
    public AmruthaProduct putMethodName(@PathVariable("productId") int id, @RequestBody AmruthaProduct product) {
        productService.updateDetails(id,product);
        return product;
    }
    
    @DeleteMapping("api/product/{productId}")
    public AmruthaProduct delete(@PathVariable("productId") int id,@RequestBody AmruthaProduct product)
    {
        productService.deleteProduct(id);
        return product;
    }
}
