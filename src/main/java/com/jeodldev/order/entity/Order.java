package com.jeodldev.order.entity;

import com.jeodldev.order.dto.FoodItemDTO;
import com.jeodldev.order.dto.Restaurant;
import com.jeodldev.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document( "order")


public class Order {

    private Long orderId;
    private List<FoodItemDTO> foodItemsList;
    private UserDTO userDTO;
    private Restaurant restaurant;
    
}
