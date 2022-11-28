package com.begin.projectA.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SALES")

public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Column(name = "EMPLOYEE_ID")
    private int employeeId;
    @Column(name = "PRODUCT_ID")
    private int productId;
    @Column
    private int quantity;
    @Column
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Column
    private LocalDateTime date;
    @ManyToOne(optional=false,cascade=CascadeType.ALL)
    @JoinColumn(name="CUSTOMER_ID", insertable = false, updatable = false)
    private Customer customer;
    @ManyToOne(optional=false,cascade=CascadeType.ALL)
    @JoinColumn(name="EMPLOYEE_ID", insertable = false, updatable = false)
    private Employee employee;
    @ManyToOne(optional=false,cascade=CascadeType.ALL)
    @JoinColumn(name="PRODUCT_ID", insertable = false, updatable = false)
    private Product product;

    public Sales() {
    }

    public Sales(Customer customerId, Employee employeeId, Product productId, int quantity,int cost, LocalDateTime date) {
        this.customerId = customerId.getId();
        this.employeeId = employeeId.getId();
        this.productId = productId.getId();
        this.quantity = quantity;
        this.cost = cost;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}
