package com.djiman.tacoCloud.data;

import com.djiman.tacoCloud.model.Order;

public interface OrderRepository {
    Order save(Order order);
}
