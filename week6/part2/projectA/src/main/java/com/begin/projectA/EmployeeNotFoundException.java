package com.begin.projectA;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(int id) {
        super("Could not find employee " + id);
    }
}
