package com.matyushenko.flowershop.services;

import com.matyushenko.flowershop.model.Order;

import java.util.List;

public interface UserService {
    void addUser(String login, String password);
    int getCash(int userId);
    int getDiscount(int userId);
    List<Order> getOrders(int userId);
}
