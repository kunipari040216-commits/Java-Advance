package com.hemanta.PurchaseOrderService_Async.repository;

import com.hemanta.PurchaseOrderService_Async.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
