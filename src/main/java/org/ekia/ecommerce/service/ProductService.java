package org.ekia.ecommerce.service;

import org.ekia.ecommerce.repository.entity.Product;

import java.util.List;

public interface ProductService
{

    Product save(Product product );

    boolean delete( int productId );

    List<Product> all();

    Product findById( int productId );

}
