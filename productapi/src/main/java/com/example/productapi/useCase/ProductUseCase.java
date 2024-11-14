package com.example.productapi.useCase;

import com.example.productapi.model.Product;
import com.example.productapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class ProductUseCase {
    private final ProductRepository productRepository;

    @Autowired
    public ProductUseCase(ProductRepository productRepository){
        this.productRepository = productRepository;
    }



    public List<Product> listProducts(){
        return productRepository.findAll();
    }


    public Product createProduct(Product product){
        return productRepository.save(product);
    }



}
