package com.begin.projectA.Service;

import com.begin.projectA.Entity.Customer;
import com.begin.projectA.Model.CustomerModel;
import com.begin.projectA.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    public Customer add(CustomerModel model) {
        Customer customer = new Customer(model.getName(), model.getPhoneNumber());
        customerRepository.save(customer);
        return customer;
    }

    public Customer edit(int id, CustomerModel model) throws Exception {
        return customerRepository.findById(id)
                .map(edit -> {
                    edit.setName(model.getName());
                    edit.setPhoneNumber(model.getPhoneNumber());
                    return customerRepository.save(edit);
                }).orElseThrow(Exception::new);
    }

    public String delete(int id) {
        customerRepository.deleteById(id);
        return "Deleted";
    }
}