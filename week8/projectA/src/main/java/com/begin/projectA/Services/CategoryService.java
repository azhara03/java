package com.begin.projectA.Services;
import com.begin.projectA.Entities.Category;
import com.begin.projectA.Models.CategoryModel;
import com.begin.projectA.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return (List<Category>) categoryRepository.findAll();
    }

    public Optional<Category> findById(int id){
        return categoryRepository.findById(id);
    }

    public Category add(CategoryModel model){
        Category category = new Category(model.getDescription());
        categoryRepository.save(category);
        return category;
    }

    public Category edit(int id, CategoryModel model) throws Exception {
        return categoryRepository.findById(id)
                .map(edit -> {
                    edit.setName(model.getDescription());
                    return categoryRepository.save(edit);
                }).orElseThrow(Exception::new);
    }

    public String delete(int id) {
        categoryRepository.deleteById(id);
        return "Deleted";
    }
}
