package com.example.productapi.controller;

import com.example.productapi.model.Product;
import com.example.productapi.useCase.ProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductUseCase productUseCase;

    @Autowired
    public ProductController(ProductUseCase productUseCase){
        this.productUseCase = productUseCase;
    }

    @GetMapping
    public List<Product> listProducts(){
        return productUseCase.listProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productUseCase.createProduct(product);
    }
}

