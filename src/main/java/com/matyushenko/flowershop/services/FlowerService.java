package com.matyushenko.flowershop.services;

import com.matyushenko.flowershop.model.Flower;

import java.util.List;

public interface FlowerService {
    List<Flower> getAllFlowers();
    Flower getFlower(int flowerId);
    int getPrice(int flowerId);
    int getQuontity(int flowerId);
}
