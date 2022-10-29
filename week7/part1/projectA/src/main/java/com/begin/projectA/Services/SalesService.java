package com.begin.projectA.Services;
import com.begin.projectA.Entities.Sales;
import com.begin.projectA.Models.SalesModel;
import com.begin.projectA.Repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;

    public List<Sales> findAll(){
        return (List<Sales>) salesRepository.findAll();
    }

    public Optional<Sales> findById(int id) {
        return salesRepository.findById(id);
    }

    public Sales add(SalesModel model) {
        Sales sales = new Sales(model.getCustomerId(), model.getEmployeeId(), model.getProductId(), model.getQuantity(), model.getCost(), model.getDate());
        salesRepository.save(sales);
        return sales;
    }

    public Sales edit(int id, SalesModel model) throws Exception {
        return salesRepository.findById(id)
                .map(edit -> {
                    edit.setCustomerId(model.getCustomerId().getId());
                    edit.setEmployeeId(model.getEmployeeId().getId());
                    edit.setProductId(model.getProductId().getId());
                    edit.setQuantity(model.getQuantity());
                    edit.setCost(model.getCost());
                    edit.setDate(model.getDate());
                    return salesRepository.save(edit);
                }).orElseThrow(Exception::new);
    }

    public String delete(int id) {
        salesRepository.deleteById(id);
        return "Deleted";
    }
}
