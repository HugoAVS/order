package com.jeodldev.order.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class FoodItemDTO {

    private long id;
    private String itemName;
    private String itemDescription;
    private boolean isVeg;
    private Number price;
    private long restaurantId;
    private Integer quantity;
    
}
