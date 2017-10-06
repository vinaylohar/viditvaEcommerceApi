package com.viditva.ecommerce.controller;

import com.viditva.ecommerce.entity.Product;
import com.viditva.ecommerce.entity.ProductCategory;
import com.viditva.ecommerce.repositories.ProductCategoryRepository;
import com.viditva.ecommerce.repositories.ProductRepository;
import com.viditva.ecommerce.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productbycategory")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @RequestMapping(method = RequestMethod.GET,value = "{id}")
    public ProductCategory getProductCategoryById(@PathVariable("id") Integer id) {
        System.out.println("getProductCategoryById called!!!");
        return productCategoryRepository.findOne(id);
    }

}
