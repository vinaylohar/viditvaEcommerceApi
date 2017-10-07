package com.viditva.ecommerce.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.viditva.ecommerce.MyEcommerceApplication;
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
        ProductCategory pc = productCategoryRepository.findOne(id);
        String str = null;
        try {
            str = MyEcommerceApplication.getObjectMapper().writeValueAsString(pc);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("Object>>>>>>>>"+str);

        /*Gson gson = new Gson();
        String jsonInString = gson.toJson(pc);
        System.out.println("Object>>>>>>>>"+jsonInString);*/
        return pc;
    }

}
