package com.matyushenko.flowershop.services;

import com.matyushenko.flowershop.model.Flower;
import com.matyushenko.flowershop.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlowerServiceImpl implements FlowerService{
    @Autowired
    private FlowerRepository flowerRepository;

    @Override
    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    @Override
    public Flower getFlower(int flowerId) {
        Flower flower = null;
        Optional<Flower> optionalFlower = flowerRepository.findById(flowerId);
        if (optionalFlower.isPresent())
            flower = optionalFlower.get();
        return flower;
    }

    @Override
    public int getPrice(int flowerId) {
        return getFlower(flowerId).getPrice();
    }

    @Override
    public int getQuontity(int flowerId) {
        return getFlower(flowerId).getQuontity();
    }
}
