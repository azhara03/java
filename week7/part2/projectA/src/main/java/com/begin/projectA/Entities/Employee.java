package com.begin.projectA.Entities;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "EMPLOYEE")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    /*@OneToMany(mappedBy="employees",targetEntity=Sales.class, fetch=FetchType.EAGER)
    private Collection sales;*/
    public Employee() {
    }

    public Employee(String name) {
        
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
/*    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.employee_id, employee.employee_id) && Objects.equals(this.name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.employee_id, this.name);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
    }
*/
}
