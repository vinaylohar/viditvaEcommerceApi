package com.viditva.ecommerce.service;

import com.viditva.ecommerce.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("productService")
public interface IProductService {
    List<Product> getAllProducts();
    Product getProductById(int productId);
    boolean addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
}
