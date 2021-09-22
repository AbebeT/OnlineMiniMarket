package com.remets.miniOnlineMarket.controller;


import com.remets.miniOnlineMarket.domain.Person;
import com.remets.miniOnlineMarket.domain.Product;
import com.remets.miniOnlineMarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable long id) {
        return productService.getById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        productService.deleteById(id);

    }
}
