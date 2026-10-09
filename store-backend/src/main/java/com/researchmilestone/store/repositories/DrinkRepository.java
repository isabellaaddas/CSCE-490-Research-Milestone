// Respository for Drink entity
package com.researchmilestone.store.repositories;

import com.researchmilestone.store.models.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

// Use this interface to perform CRUD operations on 
// Drink entity
public interface DrinkRepository extends JpaRepository<Drink, Integer> {
    Drink findByName(String name);

    Drink findById(int id);
}