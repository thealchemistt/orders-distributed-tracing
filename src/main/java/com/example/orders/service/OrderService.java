package com.example.orders.service;

import com.example.orders.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderRepository orderRepository;

    public String placeOrder(String productId) {
        logger.info("Placing order for product: {}", productId);
        String paymentResponse = restTemplate.getForObject("http://localhost:8081/payment/" + productId, String.class);
        String inventoryResponse = restTemplate.getForObject("http://localhost:8082/inventory/" + productId, String.class);
        return "Order placed. Payment data: " + paymentResponse + ", Inventory data: " + inventoryResponse;
    }
}
