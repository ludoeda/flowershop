package com.matyushenko.flowershop.repository;

import com.matyushenko.flowershop.model.Flower;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class FlowerDAOImpl implements FlowerDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Flower> getAllFlowers() {
        TypedQuery<Flower> queryFlower = entityManager.createQuery("select f from Flower f", Flower.class);
        return queryFlower.getResultList();
    }

    @Override
    public Flower getFlower(int flowerId) {
        return entityManager.find(Flower.class, flowerId);
    }

    @Override
    public int getPrice(int flowerId) {
        return getFlower(flowerId).getPrice();
    }

    @Override
    public int getQuantity(int flowerId) {
        return getFlower(flowerId).getQuantity();
    }
}
