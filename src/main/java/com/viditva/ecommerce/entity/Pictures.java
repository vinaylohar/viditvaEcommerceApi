package com.viditva.ecommerce.entity;

import com.viditva.ecommerce.serializer.LevelSerializable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pictures")
public class Pictures implements LevelSerializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int pictureId;

//    @ManyToOne(mappedBy = "products")
//    private Product product;

    @Column(name = "picture")
    private String picture;

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
/*
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }*/

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getLevel(){
        return LevelSerializable.DEFAULT_LEVEL;
    }
}
