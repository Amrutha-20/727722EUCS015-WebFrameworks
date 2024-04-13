package com.example.cw_3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cw_3.model.Product;
import com.example.cw_3.services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProductController {
    public ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }
    @PostMapping("/api/product")
    public Product postMethodName(@RequestBody Product product) {
        return productService.saveProduct(product);
       
    }

    @GetMapping("/api/product")
    public List<Product> getMethodName() {
        List<Product> list =  productService.getProducts();
        return list;
    }
    
    @GetMapping("/api/product/{productId}")
    public Product getMethodName(@PathVariable("productId") int id) {
        Product p =  productService.getProductById(id);
        return p;
    }
    
}
