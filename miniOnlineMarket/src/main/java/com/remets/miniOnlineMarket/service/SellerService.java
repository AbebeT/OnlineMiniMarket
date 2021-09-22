package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Product;
import com.remets.miniOnlineMarket.domain.Seller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface SellerService {
    public List<Seller> getAll();

    public Optional<Seller> getById(Long id);

    public void addSeller(Seller seller);

    public void deleteById(long id);
}
