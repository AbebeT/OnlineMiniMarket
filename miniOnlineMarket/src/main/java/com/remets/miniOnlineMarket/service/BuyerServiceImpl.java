package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.*;
import com.remets.miniOnlineMarket.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BuyerServiceImpl implements BuyerService{

    @Autowired
    ProductRepo productRepo;
    @Autowired
    SellerRepo sellerRepo;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    BuyerRepository buyerRepository;

    @Autowired
    CartRepo cartRepo;
    @Override
    public Optional<Buyer> getById(Long id) {
        return buyerRepository.findById(id);
    }

    @Override
    public List<Buyer> getAll() {
        return buyerRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        buyerRepository.deleteById(id);

    }
    @Override
    public void addBuyer(Buyer buyer) {
        buyerRepository.save(buyer);
    }

    @Override
    public Set<Seller> followSeller(long buyerId, long sellerId) {
        Buyer buyer = buyerRepository.findById(buyerId).get();
        Seller seller = sellerRepo.findById(sellerId).get();
        buyer.getSellers().add(seller);
        return buyerRepository.save(buyer).getSellers();
    }

    @Override
    public void placeOrder(long buyerId, long orderId) {
        Buyer buyer = buyerRepository.findById(buyerId).get();
        Order order = orderRepository.findById(orderId).get();
        buyer.getOrders().add(order);
        buyerRepository.save(buyer);
    }

    @Override
    public Set<Order> getOrdersByBuyerId(long buyerId) {
        Buyer buyer = buyerRepository.findById(buyerId).get();
        return buyer.getOrders();
    }

    @Override
    public List<Product> addProductToCart(long id, Product product) {
        Buyer buyer = buyerRepository.findById(id).get();
        Cart cart = cartRepo.findCartByBuyer(buyer);
        cart.getProducts().add(product);
        return cartRepo.save(cart).getProducts();
    }

    @Override
    public List<Product> removeProductFromCart(long id, Product product) {
        Buyer buyer = buyerRepository.findById(id).get();
        Cart cart = cartRepo.findCartByBuyer(buyer);
        cart.getProducts().remove(product);
        return cartRepo.save(cart).getProducts();
    }

    @Override
    public List<Product> getAllProductsInCart(long buyerId) {
        Buyer buyer = buyerRepository.findById(buyerId).get();
        return buyer.getCart().getProducts();
    }

    @Override
    public List<Product> clearCart(long buyerId) {
        Buyer buyer = buyerRepository.findById(buyerId).get();
        Cart cart = buyer.getCart();
        cart.setProducts(new ArrayList<>());
        cartRepo.save(cart);
        return cart.getProducts();
    }

    @Override
    public void addReviewByBuyerId(long buyerId, Review review, long productId) {
        Buyer buyer = buyerRepository.findById(buyerId).get();
        Set<Order> orders = buyer.getOrders();
        Set<Product> products = new HashSet<>();


        orders.stream().forEach(o->o.getProducts().forEach(p->products.add(p)));

        Product product = products.stream().filter(p->p.getProductId() ==productId).collect(Collectors.toList()).get(0);
        List<Review> reviews = product.getReviews();
        review.setApproved(false);
        review.setProduct(product);
        reviews.add(review);
        product.setReviews(reviews);
        productRepo.save(product);
    }




}
