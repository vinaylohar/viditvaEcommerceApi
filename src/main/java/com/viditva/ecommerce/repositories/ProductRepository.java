package com.viditva.ecommerce.repositories;

import com.viditva.ecommerce.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer> {
    public Product findByProductid(Integer productid);
}
