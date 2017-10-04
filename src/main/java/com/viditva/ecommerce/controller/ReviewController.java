package com.viditva.ecommerce.controller;

import com.viditva.ecommerce.entity.Review;
import com.viditva.ecommerce.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;

    @RequestMapping(method = RequestMethod.GET,value = "{id}")
    public Review getReviewById(@PathVariable("id") Integer id) {
        System.out.println("getReviewById called!!!");
        return reviewRepository.findOne(id);
    }

}
