package com.jeodldev.order.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    private long userId;
    private String userName;
    private String userPassword;
    private String address;
    private String city;
    
}
