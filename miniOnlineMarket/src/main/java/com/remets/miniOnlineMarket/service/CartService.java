package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Admin;
import com.remets.miniOnlineMarket.domain.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CartService {
    public List<Cart> getAll();

    public Optional<Cart> getById(Long id);

    public void addCart(Cart cart);

    public void deleteById(long id);
}
