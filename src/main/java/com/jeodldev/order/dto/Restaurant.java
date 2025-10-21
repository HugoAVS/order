package com.jeodldev.order.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Restaurant {

    private long id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
    
}
