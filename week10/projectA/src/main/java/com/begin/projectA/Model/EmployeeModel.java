package com.begin.projectA.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeModel {
    private int id;
    private String name;

    public EmployeeModel(String name) {
        this.name = name;
    }
}
