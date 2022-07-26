package org.ekia.ecommerce.repository;

import org.ekia.ecommerce.repository.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>
{
}