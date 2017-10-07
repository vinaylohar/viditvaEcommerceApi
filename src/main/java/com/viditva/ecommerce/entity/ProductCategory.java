package com.viditva.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.viditva.ecommerce.serializer.LevelSerializable;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "productcategory")
public class ProductCategory implements LevelSerializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int productCategoryId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "productCategories")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="productid")
    private Set<Product> products;
    public Set<Product> getProducts() {
        return products;
    }
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel(){
        System.out.println("Getting Level");
        return LevelSerializable.DEFAULT_LEVEL;
    }
}
