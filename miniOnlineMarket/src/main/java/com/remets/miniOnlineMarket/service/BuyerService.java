package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public interface BuyerService {
    public Optional<Buyer> getById(Long id);
    public List<Buyer> getAll();
    public void deleteById(Long id);
    public void addBuyer(Buyer buyer);

    public Set<Seller> followSeller(long buyerId, long sellerId);

    public void placeOrder(long buyerId, long orderId);

    public Set<Order> getOrdersByBuyerId(long buyerId);

    public List<Product> addProductToCart(long id, Product product);
    public List<Product> removeProductFromCart(long id, Product product);

    public List<Product> getAllProductsInCart(long buyerId);

    public List<Product> clearCart(long buyerId);

    public void addReviewByBuyerId(long buyerId, Review review, long productId);



}
