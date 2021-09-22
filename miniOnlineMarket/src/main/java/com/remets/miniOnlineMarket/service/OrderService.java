package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Buyer;
import com.remets.miniOnlineMarket.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface OrderService {
    public Optional<Order> getById(Long id);
    public List<Order> getAll();
    public void deleteById(Long id);
    public void addOrder(Order order);
}
