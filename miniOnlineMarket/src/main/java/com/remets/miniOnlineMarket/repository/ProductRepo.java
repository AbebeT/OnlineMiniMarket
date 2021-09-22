package com.remets.miniOnlineMarket.repository;

import com.remets.miniOnlineMarket.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {
    public List<Product> findAll();
}
