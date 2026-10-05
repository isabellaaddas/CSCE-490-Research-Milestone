package com.researchmilestone.store;

public class OrderService {
    private PaymentService paymentService;

    // Inject dependency for payment service via constructor
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        this.paymentService.processPayment(10.0);
    }
}