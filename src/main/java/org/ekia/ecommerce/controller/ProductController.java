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

    @CrossOrigin
    @GetMapping("/product/all")
    public Iterable<Product> getProducts(){
        return productService.all();
    }

    @CrossOrigin
    @PostMapping("/product")
    public Product addProduct(@RequestBody ProductDto productDto) { return productService.save(new Product(productDto)); }

    @CrossOrigin
    @GetMapping("/product/{id}")
    public Product getProductById( @PathVariable Integer id ){
        return productService.findById( id );
    }

    @CrossOrigin
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
        return productService.save( product );
    }
    @CrossOrigin
    @DeleteMapping( "/product/{id}" )
    public void deleteProduct( @PathVariable Integer id )
    {
        productService.delete( id );
    }


}