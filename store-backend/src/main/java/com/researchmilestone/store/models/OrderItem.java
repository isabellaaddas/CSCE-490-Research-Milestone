// Model class for Order Item entity on the backend
package com.researchmilestone.store.models;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import com.researchmilestone.store.models.Order;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Order order;

    @Column(name = "product_id")
    private int productId;

    private int quantity;
    private double price;

    // Constructors
    public OrderItem() {
    }

    public OrderItem(Order order, int pId, int quantity, double price) {
        this.order = order;
        this.productId = pId;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int pId) {
        this.productId = pId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}