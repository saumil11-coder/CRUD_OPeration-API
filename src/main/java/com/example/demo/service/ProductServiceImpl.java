package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements  ProductService{
    @Autowired
    private Repository repo;
    @Override
    public String saveProduct(Product product) {
        repo.save(product);
        return "Product id:" +product.getProdId()+" is saved Successfully";
    }
    @Override
    public List<Product> getAllProduct() {
        return repo.findAll();
    }
    @Override
    public Product getProductById(Long prodId) {
        return repo.findById(prodId).get();
    }
    @Override
    public String deleteProductById(Long prodId) {
        boolean delete = false;
        if(repo.existsById(prodId)) {
            repo.deleteById(prodId);
            delete=true;
        }
        return "Product with id "+prodId+" deleted successfully";
    }
}
