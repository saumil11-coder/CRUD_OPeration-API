package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        return new ResponseEntity<String>(productService.saveProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Product>> readAllProduct() {
        return new ResponseEntity<List<Product>>(productService.getAllProduct(), HttpStatus.OK);
    }
    @GetMapping("/get/{prodId}")
    public ResponseEntity<Product> readProductById(@PathVariable Long prodId) {
        return new ResponseEntity<Product>(productService.getProductById(prodId), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{prodId}")
    public ResponseEntity<String> deleteById(@PathVariable Long prodId) {
        return new ResponseEntity<String>(productService.deleteProductById(prodId), HttpStatus.OK);
    }
}
