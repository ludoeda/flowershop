package com.accenture.flowershop.services;

import com.accenture.flowershop.model.Flower;

import java.util.List;

public interface FlowerService {

    List<Flower> getAllFlowers();

    Flower getFlower(int flowerId);

    int getPrice(int flowerId);

    int getQuantity(int flowerId);
}
