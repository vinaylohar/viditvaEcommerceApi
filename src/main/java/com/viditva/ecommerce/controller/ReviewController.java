package com.viditva.ecommerce.controller;

import com.viditva.ecommerce.entity.Product;
import com.viditva.ecommerce.entity.Review;
import com.viditva.ecommerce.repositories.ReviewRepository;
import com.viditva.ecommerce.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Review getReviewById(@PathVariable("id") Integer id) {
        System.out.println("getReviewById called!!!");
        return reviewRepository.findOne(id);
    }

/*
    @RequestMapping(method = RequestMethod.GET,value = "/product/{productId}")
    public List<Review> getReviewByProductId(@PathVariable("productId") Integer productId) {
        System.out.println("getReviewByProductId called!!!");
        List<Review> list = Utils.toList(reviewRepository.findByProduct_Productid(productId));
        return list;
    }
*/

}
