package com.jeodldev.order.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTOFromFe {

    private List<FoodItemDTO> foodItemsList;
    private Long userId;
    private Restaurant restaurant;
    
}
