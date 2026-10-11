package com.researchmilestone.store.dtos;

import java.util.List;

@Data
public class CheckoutRequest {
    private String customerEmail;
    private List<ItemDTO> items;
    private CardDetails cardDetails; // Mocking payment processing details

    @Data
    public static class ItemDTO {
        private int productId;
        private double price;
        private int quantity;
    }

    @Data
    public static class CardDetails {
        private String cardNumber;
        private String expiryDate;
        private String cvv;
    }
}