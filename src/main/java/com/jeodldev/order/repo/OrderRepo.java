package com.jeodldev.order.repo;
import com.jeodldev.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderRepo  extends MongoRepository<Order, Long> {
    
}
