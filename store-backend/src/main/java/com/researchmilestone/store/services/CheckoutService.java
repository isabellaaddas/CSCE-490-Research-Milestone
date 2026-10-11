package com.researchmilestone.store.services;

import com.researchmilestone.store.dtos.CheckoutRequest;
import com.researchmilestone.store.models.Order;
import com.researchmilestone.store.models.OrderItem;
import com.researchmilestone.store.repositories.OrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class CheckoutService {
    private final OrderRepository orderRepository;

    public CheckoutService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public Order processCheckout(CheckoutRequest request) {
        boolean paymentSuccess = mockPaymentGateway(request.getCardDetails());
        
        if (!paymentSuccess) {
            throw new RuntimeException("Payment rejected by bank: Invalid account credentials or insufficient funds.");
        }

        double computedTotal = request.getItems().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();

        Order order = new Order();
        order.setEmail(request.getCustomerEmail());
        order.setTotalAmount(computedTotal);
        order.setStatus("COMPLETED");

        List<OrderItem> orderItems = new ArrayList<>();
        for (CheckoutRequest.ItemDTO itemDTO : request.getItems()) {
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);
            orderItem.setProductId(itemDTO.getProductId());
            orderItem.setPrice(itemDTO.getPrice());
            orderItem.setQuantity(itemDTO.getQuantity());
            orderItems.add(orderItem);
        }

        order.setItems(orderItems);

        return orderRepository.save(order);
    }

    private boolean mockPaymentGateway(CheckoutRequest.CardDetails card) {
        if (card == null || card.getCardNumber() == null) return false;
        return !card.getCardNumber().endsWith("0000");
    }
}