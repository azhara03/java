package com.begin.projectA.Controllers;
import java.util.*;
import com.begin.projectA.Entities.Sales;
import com.begin.projectA.Models.SalesModel;
import com.begin.projectA.Services.SalesService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("all")
    public List<Sales> getAll(){
        return salesService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Sales> getById(@PathVariable(name = "id") int id){
        return salesService.findById(id);
    }

    @PostMapping("/add")
    public SalesModel add(@RequestBody SalesModel model){
        salesService.add(model);
        return model;
    }

    @PutMapping("edit/{id}")
    public Sales edit(@PathVariable(name = "id") int id, @RequestBody SalesModel model) throws Exception {
        return salesService.edit(id, model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id){
        salesService.delete(id);
        return "Deleted";
    }
}
