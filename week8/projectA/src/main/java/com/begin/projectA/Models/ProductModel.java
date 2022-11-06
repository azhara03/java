package com.begin.projectA.Models;
import com.begin.projectA.Entities.Category;
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
}
