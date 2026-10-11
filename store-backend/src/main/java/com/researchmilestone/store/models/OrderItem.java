// Model class for Order Item entity on the backend
package com.researchmilestone.store.models;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JsonIgnore;

@Entity
@Table(name = "orders")
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
}