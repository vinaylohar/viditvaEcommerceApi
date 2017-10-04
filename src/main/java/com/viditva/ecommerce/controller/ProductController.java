package com.viditva.ecommerce.controller;

import com.viditva.ecommerce.entity.Product;
import com.viditva.ecommerce.repositories.ProductRepository;
import com.viditva.ecommerce.service.IProductService;
import com.viditva.ecommerce.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET,value = "{id}")
    public Product getProductById(@PathVariable("id") Integer id) {
//        Product product = productService.getProductById(id);
        System.out.println("getProductById called!!!");
        return productRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET,value = "")
    public List<Product> getAllProducts() {
        System.out.println("Get all products called!!!");
//        List<Product> list = productService.getAllProducts();
        List<Product> list = Utils.toList(productRepository.findAll());
        System.out.println("asasaGet all products called!!!");
        return list;
    }

    @RequestMapping(method = RequestMethod.POST,value ="")
    public Product addProduct(@RequestBody Product product) {
        System.out.println("addProduct called!!! " + product);
        productRepository.save(product);
        return product;
    }

    @RequestMapping(method = RequestMethod.PUT,value ="")
    public Product updateProduct(@RequestBody Product product) {
        System.out.println("updateProduct called!!!" + product);
        Product p = productRepository.findOne(product.getProductid());
        p.setName(product.getName());
        p.setDescription(product.getDescription());
        p.setDiscount(product.getDiscount());
        p.setUnitsinstock(product.getUnitsinstock());
        p.setPrice(product.getPrice());
        productRepository.save(p);
        return p;
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        System.out.println("deleteProduct called!!!" + id);
        productRepository.delete(id);
        return "Booking Id deleted successfully";
    }
}
