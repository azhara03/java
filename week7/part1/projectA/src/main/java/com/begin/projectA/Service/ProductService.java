package com.begin.projectA.Service;
import com.begin.projectA.Entities.Product;
import com.begin.projectA.Model.ProductModel;
import com.begin.projectA.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return (List<Product>) productRepository.findAll();
    }

    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    public Product add(ProductModel model) {
        Product product = new Product(model.getCategoryId(), model.getProductName(),model.getWeight(), model.getCost());
        productRepository.save(product);
        return product;
    }

    public Product edit(int id, ProductModel model) throws Exception {
        return productRepository.findById(id)
                .map(edit -> {
                    edit.setCategoryId(model.getCategoryId().getId());
                    edit.setProductName(model.getProductName());
                    edit.setWeight(model.getWeight());
                    edit.setCost(model.getCost());
                    return productRepository.save(edit);
                }).orElseThrow(Exception::new);
    }

    public String delete(int id) {
        productRepository.deleteById(id);
        return "Deleted";
    }
}
