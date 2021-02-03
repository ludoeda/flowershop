package com.matyushenko.flowershop.services;

import com.matyushenko.flowershop.model.Flower;
import com.matyushenko.flowershop.model.Order;

import java.util.List;

public interface OrderService {
    int getPriceOfOrder(int orderId);
    List<Flower> getFlowersFromOrder(int orderId);
    void setOrderDone(int orderId);
}
