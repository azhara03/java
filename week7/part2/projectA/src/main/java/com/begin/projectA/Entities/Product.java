package com.begin.projectA.Entities;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "CATEGORY_ID")
    private int categoryId;
    @Column
    private String productName;
    @Column
    private String weight;
    @Column
    private String cost;
    @ManyToOne(optional=false)
    @JoinColumn(name="CATEGORY_ID", insertable = false, updatable = false)
    private Category category;

    /*@OneToMany(mappedBy="products",targetEntity=Sales.class, fetch=FetchType.EAGER)
    private Collection sales;*/
    public Product() {
    }
    public Product(Category categoryId, String productName, String weight, String cost) {
        this.categoryId = categoryId.getId();
        this.productName = productName;
        this.weight = weight;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}


