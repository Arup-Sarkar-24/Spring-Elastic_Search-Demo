package com.mycompany.springElasticSearchDemo.controller;

import com.mycompany.springElasticSearchDemo.entity.Product;
import com.mycompany.springElasticSearchDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/findAll")
    Iterable<Product> findAll(){
       return productService.getProducts();
    }

    @PostMapping("/insert")
    public Product insertPorduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }
}
