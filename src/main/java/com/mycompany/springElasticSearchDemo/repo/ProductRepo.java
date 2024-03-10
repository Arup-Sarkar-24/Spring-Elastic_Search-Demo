package com.mycompany.springElasticSearchDemo.repo;

import com.mycompany.springElasticSearchDemo.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {
}
