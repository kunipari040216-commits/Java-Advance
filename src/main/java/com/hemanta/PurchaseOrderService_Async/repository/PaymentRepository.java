package com.hemanta.PurchaseOrderService_Async.repository;

import com.hemanta.PurchaseOrderService_Async.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {}
