package com.researchmilestone.store.controllers;

import com.researchmilestone.store.dtos.CheckoutRequest;
import com.researchmilestone.store.models.Order;
import com.researchmilestone.store.services.CheckoutService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/checkout")
@CrossOrigin(origins = "http://localhost:3000")
public class CheckoutController {
    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping
    public ResponseEntity<?> placeOrder(@RequestBody CheckoutRequest request) {
        try {
            Order completedOrder = checkoutService.processCheckout(request);
            return ResponseEntity.ok(completedOrder);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}