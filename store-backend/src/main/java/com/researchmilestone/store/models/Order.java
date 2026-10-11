// Model class for Order entity on the backend
package com.researchmilestone.store.models;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;
import com.researchmilestone.store.models.OrderItem;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customer_name")
    private String customerName;

    private String email;

    private String status;

    @Column(name = "total_amount")
    private double totalAmount;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<>();

    // Constructors
    public Order() {
    }

    public Order(String name, String email, String status, double amount, List<OrderItem> items) {
        this.customerName = name;
        this.email = email;
        this.status = status;
        this.totalAmount = amount;
        this.items.addAll(items);
    }

    // Getters and Setters
    public String getName() {
        return this.customerName;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(double amount) {
        this.totalAmount = amount;
    }

    public List<OrderItem> getitems() {
        return this.items;
    }

    public void setItems(List<OrderItem> items) {
        this.items.clear();
        this.items.addAll(items);
    }
}