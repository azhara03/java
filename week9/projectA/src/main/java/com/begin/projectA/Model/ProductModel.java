package com.begin.projectA.Model;
import com.begin.projectA.Entity.Category;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
    private int id;
    private Category categoryId;
    private String productName;
    private String weight;
    private String cost;

    public ProductModel(Category categoryId, String productName, String weight, String cost) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.weight = weight;
        this.cost = cost;
    }
}
