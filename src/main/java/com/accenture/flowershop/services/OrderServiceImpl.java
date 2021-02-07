package com.accenture.flowershop.services;

import com.accenture.flowershop.model.Flower;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public int getPriceOfOrder(int orderId) {
        return 0;
    }

    @Override
    public List<Flower> getFlowersFromOrder(int orderId) {
        return null;
    }

    @Override
    public void setOrderDone(int orderId) {

    }
}
