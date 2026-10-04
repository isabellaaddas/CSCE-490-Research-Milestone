package com.researchmilestone.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Use home controller for handling root website requests
@Controller
public class HomeController {
    // Handle requests to the root URL using annotation 
    // RequestMapping method
    @RequestMapping("/")
    public String index() {
        return "index.html";    // The view that should be
                                // returned upon landing at 
                                // the root URL
    }
}