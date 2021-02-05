package com.matyushenko.flowershop.services;

import com.matyushenko.flowershop.model.Flower;
import com.matyushenko.flowershop.repository.FlowerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FlowerServiceImpl implements FlowerService{
    @Autowired
    private FlowerDAO flowerDAO;

    @Override
    @Transactional
    public List<Flower> getAllFlowers() {
        return flowerDAO.getAllFlowers();
    }

    @Override
    @Transactional
    public Flower getFlower(int flowerId) {
        return flowerDAO.getFlower(flowerId);
    }

    @Override
    @Transactional
    public int getPrice(int flowerId) {
        return flowerDAO.getPrice(flowerId);
    }

    @Override
    @Transactional
    public int getQuantity(int flowerId) {
        return flowerDAO.getQuantity(flowerId);
    }
}
