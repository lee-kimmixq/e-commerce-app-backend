package org.ekia.ecommerce.service;

import org.ekia.ecommerce.repository.ProductRepository;
import org.ekia.ecommerce.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
    private final ProductRepository productRepository;

    public ProductServiceImpl(@Autowired ProductRepository productRepository )
    {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product )
    {
        return productRepository.save(product);
    }

    @Override
    public boolean delete( int productId )
    {
        Product product = productRepository.findById(productId).orElse(null);
        if (product == null) {
            return false;
        }
        productRepository.delete(product);
        return true;
    }

    @Override
    public List<Product> all()
    {
        List<Product> productList = new ArrayList<>();
        Iterable<Product> iterable = productRepository.findAll();
        iterable.forEach(productList::add);
        return productList;
    }

    @Override
    public Product findById( int productId )
    {
        return productRepository.findById(productId).orElse(null);
    }
}
