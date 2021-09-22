package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Address;
import com.remets.miniOnlineMarket.domain.Cart;
import com.remets.miniOnlineMarket.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepo cartRepo;

    @Override
    public List<Cart> getAll() {
        return cartRepo.findAll();
    }

    @Override
    public Optional<Cart> getById(Long id) {
        return cartRepo.findById(id);
    }

    @Override
    public void addCart(Cart cart) {
        cartRepo.save(cart);
    }

    @Override
    public void deleteById(long id) {
        cartRepo.deleteById(id);
    }
}
