package com.example.demo.repo;

import com.example.demo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository  extends MongoRepository<Product, Long> {

}
