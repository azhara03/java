package com.begin.projectA.Controller;
import java.util.*;
import com.begin.projectA.Entity.Product;
import com.begin.projectA.Model.ProductModel;
import com.begin.projectA.Service.ProductService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping("all")
    public List<Product> getAll(){
        return productService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Product> getById(@PathVariable(name = "id") int id){
        return productService.findById(id);
    }

    @PostMapping("/add")
    public ProductModel add(@RequestBody ProductModel model){
        productService.add(model);
        return model;
    }

    @PutMapping("edit/{id}")
    public Product edit(@PathVariable(name = "id") int id, @RequestBody ProductModel model) throws Exception {
        return productService.edit(id, model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id){
        productService.delete(id);
        return "Deleted";
    }
}
