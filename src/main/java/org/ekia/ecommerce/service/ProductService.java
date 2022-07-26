package org.ekia.ecommerce.service;

import org.ekia.ecommerce.repository.entity.Product;

import java.util.List;

public interface ProductService
{

    Product save(Product item );

    boolean delete( int itemId );

    List<Product> all();

    Product findById( int itemId );

}
