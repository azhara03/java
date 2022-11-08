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
}
