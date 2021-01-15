package com.wenbo.seckill.db.dao;

import com.wenbo.seckill.db.po.Order;

public interface OrderDao {
    void insertOrder(Order order);

    Order queryOrder(String orderNo);

    void updateOrder(Order order);
}
