package com.begin.projectA.Controller;

import com.begin.projectA.Entity.Customer;
import com.begin.projectA.Model.CustomerModel;
import com.begin.projectA.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("all")
    public List<Customer> getAll() {
        return customerService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Customer> getById(@PathVariable(name = "id") int id) {
        return customerService.findById(id);
    }

    @PostMapping("/add")
    public CustomerModel add(@RequestBody CustomerModel model) {
        customerService.add(model);
        return model;
    }

    @PutMapping("edit/{id}")
    public Customer edit(@PathVariable(name = "id") int id, @RequestBody CustomerModel model) throws Exception {
        return customerService.edit(id, model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id) {
        customerService.delete(id);
        return "Deleted";
    }
}
