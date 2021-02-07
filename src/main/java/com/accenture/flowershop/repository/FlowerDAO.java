package com.accenture.flowershop.repository;

import com.accenture.flowershop.model.Flower;

import java.util.List;

public interface FlowerDAO {

    List<Flower> getAllFlowers();

    Flower getFlower(int flowerId);

    int getPrice(int flowerId);

    int getQuantity(int flowerId);
}
