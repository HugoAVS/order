package com.jeodldev.order.controller;

import com.jeodldev.order.dto.OrderDTO;
import com.jeodldev.order.dto.OrderDTOFromFe;
import com.jeodldev.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")

public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFe orderDetails) {
        OrderDTO orderSaveInDB = orderService.saveOrderInDB(orderDetails);
        return new ResponseEntity<>(orderSaveInDB, HttpStatus.CREATED);
    }
    
}
