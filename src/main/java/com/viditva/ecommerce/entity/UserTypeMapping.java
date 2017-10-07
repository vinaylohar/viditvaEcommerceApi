package com.viditva.ecommerce.entity;

import com.viditva.ecommerce.serializer.LevelSerializable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usertypemapping")
public class UserTypeMapping implements LevelSerializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int reviewId;

//    @ManyToOne(mappedBy = "products")
//    private Product product;

//    @ManyToOne(mappedBy = "userdetails")
//    private UserDetails userdetails;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "rating")
    private int rating;

    public int getLevel(){
        return LevelSerializable.DEFAULT_LEVEL;
    }
}
