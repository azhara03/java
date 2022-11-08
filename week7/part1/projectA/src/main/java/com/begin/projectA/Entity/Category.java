package com.begin.projectA.Entities;
import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String description;
    /*@OneToMany(mappedBy="category",targetEntity=Product.class, fetch=FetchType.EAGER)
    private Collection sales;*/
    public Category() {
    }

    public Category(String name) {
        this.description = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String description) {
        this.description = description;
    }

}
