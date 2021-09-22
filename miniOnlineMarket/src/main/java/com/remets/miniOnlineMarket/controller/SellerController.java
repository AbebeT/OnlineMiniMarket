package com.remets.miniOnlineMarket.controller;


import com.remets.miniOnlineMarket.domain.Product;
import com.remets.miniOnlineMarket.domain.Seller;
import com.remets.miniOnlineMarket.repository.SellerRepo;
import com.remets.miniOnlineMarket.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    SellerService sellerService;


    @GetMapping
    public List<Seller> getAll() {
        return sellerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Seller> getById(@PathVariable long id) {
        return sellerService.getById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Seller seller) {
        sellerService.addSeller(seller);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        sellerService.deleteById(id);

    }

}
