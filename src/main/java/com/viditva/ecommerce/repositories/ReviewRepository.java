package com.viditva.ecommerce.repositories;

import com.viditva.ecommerce.entity.Product;
import com.viditva.ecommerce.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    public Review findByReviewId(Integer reviewId);
    public List<Review> findByProduct_Productid(Integer productid);
}
