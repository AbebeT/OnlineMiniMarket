package com.remets.miniOnlineMarket.controller;


import com.remets.miniOnlineMarket.domain.Order;
import com.remets.miniOnlineMarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAll(){
        return orderService.getAll();
    }

    @GetMapping("/orders/{id}")
    public Optional<Order> getById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteById(@PathVariable Long id) {
        orderService.deleteById(id);
    }

    @PostMapping("/orders")
    public void addBuyer(@RequestBody Order order) {
        orderService.addOrder(order);

    }
}
