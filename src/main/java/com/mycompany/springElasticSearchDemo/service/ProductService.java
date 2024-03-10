package com.mycompany.springElasticSearchDemo.service;

import com.mycompany.springElasticSearchDemo.entity.Product;
import com.mycompany.springElasticSearchDemo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> getProducts(){
        return  productRepo.findAll();
    }

    public Product insertProduct(Product product){
        return  productRepo.save(product);
    }

    public Product updateProduct(Product product, int id){
        Product product1 = productRepo.findById(id).orElseThrow(()->new RuntimeException("Account does not exist"));
        product1.setPrice(product.getPrice());
        return  product1;
    }

    public void deleteProducts(int id){
        productRepo.deleteById(id);
    }
}
