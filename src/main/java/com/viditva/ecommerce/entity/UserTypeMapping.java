package com.viditva.ecommerce.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usertypemapping")
public class UserTypeMapping implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int reviewId;

//    @ManyToOne(mappedBy = "products")
    private Product product;

//    @ManyToOne(mappedBy = "userdetails")
    private UserDetails userdetails;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "rating")
    private int rating;
}
