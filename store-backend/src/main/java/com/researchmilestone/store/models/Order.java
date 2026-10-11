// Model class for Order entity on the backend
package com.researchmilestone.store.models;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import java.util.List;
import com.researchmilestone.store.models.OrderItem;

@Entity
@Table(name = "orders")
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "total_amount")
    private double totalAmount;

    private String status;

    @Column(name = "transaction_id")
    private int transactionId;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<>();

    // Constructors
}