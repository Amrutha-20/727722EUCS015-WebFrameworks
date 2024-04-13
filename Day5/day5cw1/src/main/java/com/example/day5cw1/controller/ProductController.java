package com.example.day5cw1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw1.model.Product;
import com.example.day5cw1.service.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProductController {
    public ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }
    @PostMapping("/api/product")
    public Product postMethodName(@RequestBody Product product) {
        productService.saveProduct(product);
        return product;
       
    }

    @PutMapping("/api/product/{productId}")
    public Product putMethodName(@PathVariable("productId") int id, @RequestBody Product product) {
        productService.updateDetails(id,product);
        return product;
    }
    
    @DeleteMapping("api/product/{productId}")
    public Product delete(@PathVariable("productId") int id,@RequestBody Product product)
    {
        productService.deleteProduct(id);
        return product;
    }
}
