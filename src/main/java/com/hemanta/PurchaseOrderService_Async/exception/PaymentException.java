package com.hemanta.PurchaseOrderService_Async.exception;

import org.springframework.http.HttpStatus;

public class PaymentException extends RuntimeException{

    public PaymentException(String message){
        super(message);
    }
}
