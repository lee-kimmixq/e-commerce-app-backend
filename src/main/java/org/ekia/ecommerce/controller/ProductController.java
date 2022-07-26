package org.ekia.ecommerce.controller;

import org.ekia.ecommerce.controller.dto.ProductDto;
import org.ekia.ecommerce.service.ProductService;
import org.ekia.ecommerce.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController{

    final ProductService productService;

    public ProductController(@Autowired ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/product/all")
    public Iterable<Product> getProducts(){
        return productService.all();
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody ProductDto productDto) { return productService.save(new Product(productDto)); }
//Just added for Question 7 -To be review by Kimmi
    @GetMapping("/product/{id}")
    public Product getProductById( @PathVariable Integer id ){
        return productService.findById( id );
    }

    @PutMapping( "/product/{id}" )
    public Product updateProduct( @RequestBody ProductDto productDto, @PathVariable Integer id )
    {
        Product product = productService.findById( id );
        product.setName( productDto.getName() );
        product.setPrice( productDto.getPrice() );
        product.setPriceDisc( productDto.getPriceDisc() );
        product.setDescription( productDto.getDescription() );
        product.setImageUrl( productDto.getImageUrl() );
        product.setOnSale( productDto.isOnSale() );
        product.setName( productDto.getName() );
        product.setName( productDto.getName() );
        return productService.save( product );
    }

    @DeleteMapping( "/product/{id}" )
    public void deleteProduct( @PathVariable Integer id )
    {
        productService.delete( id );
    }


}