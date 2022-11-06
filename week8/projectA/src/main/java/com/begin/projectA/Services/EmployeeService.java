package com.begin.projectA.Services;

import com.begin.projectA.Entities.Employee;
import com.begin.projectA.Models.EmployeeModel;
import com.begin.projectA.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Optional<Employee> findById(int id){
        return employeeRepository.findById(id);
    }

    public Employee add(EmployeeModel model){
        Employee employee = new Employee(model.getName());
        employeeRepository.save(employee);
        return employee;
    }

    public Employee edit(int id, EmployeeModel model) throws Exception {
        return employeeRepository.findById(id)
                .map(edit -> {
                    edit.setName(model.getName());
                    return employeeRepository.save(edit);
                }).orElseThrow(Exception::new);
    }

    public String delete(int id){
        employeeRepository.deleteById(id);
        return "Deleted";
    }
}
