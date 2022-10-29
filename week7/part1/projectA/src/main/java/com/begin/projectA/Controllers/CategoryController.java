package com.begin.projectA.Controllers;
import java.util.*;
import com.begin.projectA.Entities.Category;
import com.begin.projectA.Models.CategoryModel;
import com.begin.projectA.Services.CategoryService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("all")
    public List<Category> getAll(){
        return categoryService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Category> getById(@PathVariable(name = "id") int id){
        return categoryService.findById(id);
    }

    @PostMapping("/add")
    public CategoryModel add(@RequestBody CategoryModel model){
        categoryService.add(model);
        return model;
    }

    @PutMapping("edit/{id}")
    public Category edit(@PathVariable(name = "id") int id, @RequestBody CategoryModel model) throws Exception {
        return categoryService.edit(id, model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id){
        categoryService.delete(id);
        return "Deleted";
    }
}
