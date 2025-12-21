package com.order.project.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders_t")
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    private String orderName;

    private Double orderRate;
}
