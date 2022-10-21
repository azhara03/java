package com.begin.projectA.Controllers;
import java.util.List;
import com.begin.projectA.EmployeeNotFoundException;
import com.begin.projectA.EmployeeRepository;
import com.begin.projectA.Models.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable int id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/update/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable int id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/delete/{id}")
    String deleteEmployee(@PathVariable int id) {
        repository.deleteById(id);
        return "deleted user with usr id "+id;
    }
}
