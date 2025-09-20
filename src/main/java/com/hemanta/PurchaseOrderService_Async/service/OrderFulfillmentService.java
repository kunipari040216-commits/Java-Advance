package com.hemanta.PurchaseOrderService_Async.service;

import com.hemanta.PurchaseOrderService_Async.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class OrderFulfillmentService {
    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private PaymentService paymentService;

    public Order processOrder(Order order) throws  InterruptedException{

        order.setTrackingId(UUID.randomUUID().toString());
        if(inventoryService.checkProductAvailability(order.getProductId())){
            paymentService.processPayment(order);
        }
        else{
            throw new RuntimeException("Technical Issue, please try after some time");
        }
        return order;
    }
    public void notifiUser(Order order) throws InterruptedException{
        Thread.sleep(2000L);
        log.info("Notified to the user", Thread.currentThread().getName());
    }

    public void assignVendor(Order order) throws InterruptedException{
        Thread.sleep(2000L);
        log.info("Notified to the vendor", Thread.currentThread().getName());
    }
    public void packaging(Order order) throws InterruptedException{
        Thread.sleep(2000L);
        log.info("Order packaging completed", Thread.currentThread().getName());
    }

    public void assignDeliveryPartner(Order order) throws InterruptedException{
        Thread.sleep(2000L);
        log.info("Delioverty Partner assigned", Thread.currentThread().getName());
    }

    public void assignTrailerAndDispatch(Order order) throws InterruptedException{
        Thread.sleep(2000L);
        log.info("assign Trailer And Order Dispatch", Thread.currentThread().getName());
    }


}
