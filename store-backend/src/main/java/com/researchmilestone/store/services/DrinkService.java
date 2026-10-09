// Service to retrieve drinks from the database
package com.researchmilestone.store.services;

import org.springframework.stereotype.Component;
import com.researchmilestone.store.models.Drink;
import com.researchmilestone.store.repositories.DrinkRepository;
import java.util.List;

@Component
public class DrinkService {
    private final DrinkRepository drinkRepository;

    // Inject dependency for drink repository via constructor
    // (standard practice)
    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    // Retrieve a drink by its name
    public Drink getDrinkByName(String name) {
        return this.drinkRepository.findByName(name);
    }

    // Retrieve a drink by its ID
    public Drink getDrinkById(int id) {
        return this.drinkRepository.findById(id);
    }

    // Retrieve all drinks from the database
    public List<Drink> getAllDrinks() {
        return this.drinkRepository.findAll();
    }
}