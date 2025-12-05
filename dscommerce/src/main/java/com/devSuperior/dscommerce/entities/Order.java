package com.devSuperior.dscommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
    private Payment payment;

    public Order(Long id, Payment payment, User client, OrderStatus status, Instant moment) {
        this.id = id;
        this.payment = payment;
        this.client = client;
        this.status = status;
        this.moment = moment;
    }

    public Order(){
    }



}
