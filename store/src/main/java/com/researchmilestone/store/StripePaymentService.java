package com.researchmilestone.store;

// Service for handling payments through Stripe
public class StripePaymentService implements PaymentService {
    // Use arbitrary amount for example + practice
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}