package com.matyushenko.flowershop.services;

import com.matyushenko.flowershop.model.Flower;
import org.springframework.beans.factory.annotation.Autowired;
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
