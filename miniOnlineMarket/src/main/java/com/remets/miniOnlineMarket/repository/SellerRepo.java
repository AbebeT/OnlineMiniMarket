package com.remets.miniOnlineMarket.repository;

import com.remets.miniOnlineMarket.domain.Seller;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SellerRepo extends CrudRepository<Seller, Long> {
    public List<Seller> findAll();
}
