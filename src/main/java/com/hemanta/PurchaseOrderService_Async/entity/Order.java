package com.hemanta.PurchaseOrderService_Async.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private Long productId;
    private String trackingId;
    private Long productId;


    private Integer quantity;
    private String status;
    private LocalDateTime orderDate;

}
