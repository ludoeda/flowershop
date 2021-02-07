package com.accenture.flowershop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "flowers")
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @Column(name = "quantity")
    private Integer quantity;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "buckets",
//    joinColumns = @JoinColumn(name = "flowerId"),
//    inverseJoinColumns = @JoinColumn(name = "orderId"))
//    private List<Order> orders;
//
//    public void addOrderToFlower(Order order) {
//        if (orders == null)
//            orders = new ArrayList<>();
//        orders.add(order);
//    }

}
