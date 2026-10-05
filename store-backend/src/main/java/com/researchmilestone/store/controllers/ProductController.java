package com.researchmilestone.store.controllers;

// Import statements to include Product and annotations
import com.researchmilestone.store.models.Product;
import org.springframework.web.bind.annotation.*;

// Import some data structures for use
import java.util.ArrayList;
import java.util.List;

@RestController                  // Specify RESTful controller
@RequestMapping("/api/products")    // Endpoint to control
@CrossOrigin(origins = {"http://localhost:5173",
        "http://127.0.0.1:5173"
})
public class ProductController {
    // Controller methods for handling requests
    // for products

    private final List<Product> products = new ArrayList<>();

    // Constructor for the controller, will initialize some
    // products for sending back to client
    public ProductController() {
        products.add(new Product(1, "Coffee beans", 10.0));
        products.add(new Product(2, "Latte", 20.0));
        products.add(new Product(3, "Iced tea", 30.0));
    }

    // This method handles GET requests for products
    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    // This method handles POST requests for adding products
    // RequestBody annotation will convert any JSON data into
    // a Product object
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        product.setId(products.size() + 1);     // ID will be linearly 
                                                // incremented
        products.add(product);
        return product;
    }
}