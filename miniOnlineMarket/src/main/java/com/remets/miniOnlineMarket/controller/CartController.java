package com.remets.miniOnlineMarket.controller;

import com.remets.miniOnlineMarket.domain.Cart;
import com.remets.miniOnlineMarket.repository.CartRepo;
import com.remets.miniOnlineMarket.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    CartService cartService;
@GetMapping
    public List<Cart> getAll() {
        return cartService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cart> getById(@PathVariable long id) {
        return cartService.getById(id);
    }
    @PostMapping
    public void addCart(@RequestBody Cart cart) {
        cartService.addCart(cart);
    }

   @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        cartService.deleteById(id);
    }
}
