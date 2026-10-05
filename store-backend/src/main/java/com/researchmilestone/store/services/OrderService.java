package com.researchmilestone.store.services;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;

    // Inject dependency for payment service via constructor
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Place an order using the payment service
    public void placeOrder() {
        this.paymentService.processPayment(10.0);
    }

    // Setter for payment service
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}