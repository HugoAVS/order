package com.jeodldev.order.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO {
    private Long orderId;
    private List<FoodItemDTO> foodItemsList;
    private UserDTO user;
    private Restaurant restaurant;
    private UserDTO userDTO;
    
}
