package org.ekia.ecommerce.controller;

import org.ekia.ecommerce.repository.ProductRepository;
import org.ekia.ecommerce.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController{

    final ProductRepository productRepository;


    public ProductController(@Autowired ProductRepository productRepository )
    {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Iterable<Product> getItems(){
        return productRepository.findAll();
    }
}