// Controller to handle drink-related requests
package com.researchmilestone.store.controllers;

import com.researchmilestone.store.models.Drink;
import com.researchmilestone.store.services.DrinkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/drinks")
public class DrinkController {
    private final DrinkService drinkService;

    // Inject dependency via constructor
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    // GET request
    @GetMapping
    public List<Drink> getAllDrinks() {
        return drinkService.getAllDrinks();
    }

    // GET request with path variable (id)
    @GetMapping("/{id}")
    public Drink getDrinkById(@PathVariable Long id) {
        return drinkService.getDrinkById(id);
    }
}