package com.viditva.ecommerce.dao;

import com.viditva.ecommerce.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/*@Transactional
@Repository*/
public class ProductDAO /*implements IProductDAO*/ {
  /*  @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAllProducts() {
        String hql = "FROM Product as product ORDER BY product.name";
        return (List<Product>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Product getProductById(int productId) {
        return entityManager.find(Product.class, productId);
    }

    @Override
    public void addProduct(Product product) {
        entityManager.persist(product);
    }

    @Override
    public void updateProduct(Product product) {
        Product currentProduct = getProductById(product.getProductid());
        currentProduct.setName(product.getName());
        currentProduct.setDescription(product.getDescription());
        currentProduct.setDiscount(product.getDiscount());
        currentProduct.setPrice(product.getPrice());
        currentProduct.setUnitsinstock(product.getUnitsinstock());
        entityManager.flush();
    }

    @Override
    public void deleteProduct(int productId) {
        entityManager.remove(getProductById(productId));
    }

    @Override
    public boolean productExists(String name) {
        String hql = "FROM Product as prod WHERE prod.name = ?";
        int count = entityManager.createQuery(hql).setParameter(1, name).getResultList().size();
        return count > 0 ? true : false;
    }*/
}
