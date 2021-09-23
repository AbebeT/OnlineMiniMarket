package com.remets.miniOnlineMarket.controller;

import com.remets.miniOnlineMarket.domain.*;
import com.remets.miniOnlineMarket.service.buyer.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/buyers")
public class BuyerController {
    @Autowired
    BuyerService buyerService;

    @GetMapping
    public List<Buyer> getAll() {
        return buyerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Buyer> getById(@PathVariable Long id) {
        return buyerService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        buyerService.deleteById(id);
    }

    @PostMapping
    public void addBuyer(@RequestBody Buyer buyer) {
        buyerService.addBuyer(buyer);

    }

    @PostMapping("{/buyerId}/sellers/{/sellerid}/follow")
    public Set<Seller> followSeller(@PathVariable long buyerId, @PathVariable long sellerId) {
        return buyerService.followSeller(buyerId, sellerId);
    }

    @PostMapping("{/buyerId}/sellers/{/sellerid}/unfollow")
    public Set<Seller> unFollowSeller(@PathVariable long buyerId, @PathVariable long sellerId) {
        return buyerService.unFollowSeller(buyerId, sellerId);
    }

    @GetMapping("/{buyerId}/orders")
    public Set<Order> getOrdersByBuyerId(@PathVariable long buyerId) {
        return buyerService.getOrdersByBuyerId(buyerId);
    }

    @PostMapping("/{id}/carts/products")
    public List<Product> addProductToCart(@PathVariable long id, @RequestBody Product product) {
        return buyerService.addProductToCart(id, product);
    }

    @DeleteMapping("{/id}/carts/products")
    public List<Product> removeProductFromCart(@PathVariable long id, Product product) {
        return buyerService.removeProductFromCart(id, product);
    }

    @GetMapping("/{buyerId}/carts/products")
    public List<Product> getAllProductsInCart(@PathVariable long buyerId) {
        return buyerService.getAllProductsInCart(buyerId);
    }

    @DeleteMapping("/{buyerId}/carts")
    public List<Product> clearCart(@PathVariable long buyerId) {
        return buyerService.clearCart(buyerId);
    }

    @PostMapping("/{buyerId}/products/{productId}/review")
    public void addReviewByBuyerId(@PathVariable long buyerId, @RequestBody Review review, @PathVariable long productId) {
        buyerService.addReviewByBuyerId(buyerId, review, productId);
    }

    @GetMapping("/{buyerId}/carts")
    public Receipt processCart(@PathVariable long buyerId) {
        return buyerService.processCart(buyerId);

    }
}
