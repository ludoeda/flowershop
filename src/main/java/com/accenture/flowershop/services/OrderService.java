package com.accenture.flowershop.services;

import com.accenture.flowershop.model.Flower;

import java.util.List;

public interface OrderService {
    int getPriceOfOrder(int orderId);
    List<Flower> getFlowersFromOrder(int orderId);
    void setOrderDone(int orderId);
}
