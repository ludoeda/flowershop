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
@Table(schema = "flowershop", name = "buckets")
public class Bucket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "quontity")
    private int quontity;

    @Column(name = "price")
    private int price;

    @Column(name = "orderId")
    private int orderId;

    @Column(name = "flowerId")
    private int flowerId;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "flowerId")
//    private Flower flower;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "orderId")
//    private Order order;

}
