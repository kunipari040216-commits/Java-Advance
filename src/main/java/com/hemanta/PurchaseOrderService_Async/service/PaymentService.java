package com.hemanta.PurchaseOrderService_Async.service;

import com.hemanta.PurchaseOrderService_Async.entity.Order;
import com.hemanta.PurchaseOrderService_Async.entity.Payment;
import com.hemanta.PurchaseOrderService_Async.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PaymentService {
    public void processPayment(Order order) throws InterruptedException {

        log.info("Initiate payment for the order",order.getProductId());
        Thread.sleep(1000L);
        log.info("Completed payment for the order",order.getProductId());

    }

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment getById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }

    public void delete(Long id) {
        paymentRepository.deleteById(id);
    }

}
