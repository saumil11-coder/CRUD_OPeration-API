package com.example.demo.service;
import java.util.*;
import com.example.demo.model.Product;

public interface ProductService {

    String saveProduct(Product product);
    List<Product> getAllProduct();
    Product getProductById(Long prodId);
    String deleteProductById(Long prodId);
}