package com.viditva.ecommerce.dao;

import com.viditva.ecommerce.entity.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> getAllProducts();
    Product getProductById(int productId);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    boolean productExists(String name);
}
