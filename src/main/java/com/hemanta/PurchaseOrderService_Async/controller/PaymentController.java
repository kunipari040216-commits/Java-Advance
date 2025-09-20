package com.hemanta.PurchaseOrderService_Async.controller;

import com.hemanta.PurchaseOrderService_Async.entity.Payment;
import com.hemanta.PurchaseOrderService_Async.exception.PaymentException;
import com.hemanta.PurchaseOrderService_Async.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;



    @PostMapping
   public ResponseEntity<?> create(@RequestBody Payment payment) {

        return new ResponseEntity<>(paymentService.save(payment),HttpStatus.CREATED);

    }


    /*@GetMapping("/{id}")
    public Payment get(@PathVariable Long id) {
        return paymentService.getById(id);
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {
        Payment payment = paymentService.getById(id);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }
    @GetMapping
    public List<Payment> getAll() {
        return paymentService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        paymentService.delete(id);
    }
}
