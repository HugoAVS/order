package com.jeodldev.order.service;

import com.jeodldev.order.dto.OrderDTO;
import com.jeodldev.order.dto.OrderDTOFromFe;
import com.jeodldev.order.dto.UserDTO;
import com.jeodldev.order.entity.Order;
import com.jeodldev.order.mapper.OrderMapper;   
import com.jeodldev.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service


public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public OrderDTO saveOrderInDB(OrderDTOFromFe orderDetails) {
        Long newOrderId = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserDetailsFromUserId(orderDetails.getUserId());
        Order orderToBeSaved =  
            new Order(newOrderId, orderDetails.getFoodItemsList(), userDTO, orderDetails.getRestaurant());
            orderRepo.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
    }

    private UserDTO fetchUserDetailsFromUserId(Long userId) {
        return restTemplate.getForObject("http://USER-SERVICE/api/user/fetchUserById/" + userId, UserDTO.class);
    }
    
}
