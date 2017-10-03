package com.viditva.ecommerce.service;

import com.viditva.ecommerce.dao.IProductDAO;
import com.viditva.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*@Service*/
public class ProductService /*implements IProductService*/ {
   /* @Autowired
    private IProductDAO productDao;
    @Override
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public boolean addProduct(Product product) {
        if (productDao.productExists(product.getName())) {
            return false;
        } else {
            productDao.addProduct(product);
            return true;
        }
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public void deleteProduct(int productId) {
        productDao.deleteProduct(productId);
    }*/
}
