package com.viditva.ecommerce.repositories;

import com.viditva.ecommerce.entity.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {
    public ProductCategory findByProductCategoryId(Integer productCategoryId);
}
