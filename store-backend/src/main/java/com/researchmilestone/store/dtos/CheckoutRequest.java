package com.researchmilestone.store.dtos;

import java.util.List;

public class CheckoutRequest {
    private String customerEmail;
    private List<ItemDTO> items;
    private CardDetails cardDetails;

    // Outer Class Getters & Setters
    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }

    public List<ItemDTO> getItems() { return items; }
    public void setItems(List<ItemDTO> items) { this.items = items; }

    public CardDetails getCardDetails() { return cardDetails; }
    public void setCardDetails(CardDetails cardDetails) { this.cardDetails = cardDetails; }

    public static class ItemDTO {
        private int productId;
        private double price;
        private int quantity;

        // ItemDTO Getters & Setters
        public int getProductId() { return productId; }
        public void setProductId(int productId) { this.productId = productId; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }

        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
    }

    public static class CardDetails {
        private String cardNumber;
        private String expiryDate;
        private String cvv;

        // CardDetails Getters & Setters
        public String getCardNumber() { return cardNumber; }
        public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

        public String getExpiryDate() { return expiryDate; }
        public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

        public String getCvv() { return cvv; }
        public void setCvv(String cvv) { this.cvv = cvv; }
    }
}