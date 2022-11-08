package com.begin.projectA.Exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(int id) {
        super("Could not find employee " + id);
    }
}
