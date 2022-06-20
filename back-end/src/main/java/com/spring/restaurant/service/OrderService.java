package com.spring.restaurant.service;


import com.spring.restaurant.dao.OrderRepo;
import com.spring.restaurant.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public List<Order> orders() {
        return orderRepo.findAll();
    }
}
