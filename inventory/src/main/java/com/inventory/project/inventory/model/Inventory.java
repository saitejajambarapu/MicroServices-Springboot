package com.inventory.project.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "inventory_t")
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long inventoryId;

    private String inventoryName;

    private String orderId;
}
