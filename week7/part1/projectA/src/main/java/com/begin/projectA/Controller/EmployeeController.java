package com.begin.projectA.Controllers;
import java.util.*;;

import com.begin.projectA.EmployeeNotFoundException;
import com.begin.projectA.Model.EmployeeModel;
import com.begin.projectA.Entities.Employee;
import com.begin.projectA.Service.EmployeeService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("all")
    public List<Employee> getAll(){
        return employeeService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Employee> getById(@PathVariable(name = "id") int id){
        return employeeService.findById(id);
    }

    @PostMapping("/add")
    public EmployeeModel add(@RequestBody EmployeeModel model){
        employeeService.add(model);
        return model;
    }

    @PutMapping("edit/{id}")
    public Employee edit(@PathVariable(name = "id") int id, @RequestBody EmployeeModel model) throws Exception {
        return employeeService.edit(id, model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id){
        employeeService.delete(id);
        return "Deleted";
    }
}
