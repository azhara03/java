package com.begin.projectA.Model;
import com.begin.projectA.Entity.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class SalesModel {
    private int id;
    private Customer customerId;
    private Employee employeeId;
    private Product productId;
    private int quantity;
    private int cost;
    private LocalDateTime date;
}
