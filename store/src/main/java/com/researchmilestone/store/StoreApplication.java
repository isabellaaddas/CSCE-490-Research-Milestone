package com.researchmilestone.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		AppplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var OrderService = context.getBean(OrderService.class);
		OrderService.placeOrder();
	}
}
