package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Buyer;
import com.remets.miniOnlineMarket.domain.Order;
import com.remets.miniOnlineMarket.repository.BuyerRepository;
import com.remets.miniOnlineMarket.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;
    @Override
    public Optional<Order> getById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);

    }
    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);

    }
}
