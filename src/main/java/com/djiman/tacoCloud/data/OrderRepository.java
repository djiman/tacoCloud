package com.djiman.tacoCloud.data;

import com.djiman.tacoCloud.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
    /*Order save(Order order);*/
}
