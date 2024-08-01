package com.example.orders.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository {
    private Map<String, String> orders = new HashMap<>();

    public void saveOrder(String productId, String status) {
        orders.put(productId, status);
    }
}