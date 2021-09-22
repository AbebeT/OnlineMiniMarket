package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Seller;
import com.remets.miniOnlineMarket.repository.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class SellerServiceImpl implements  SellerService{
    @Autowired
    SellerRepo sellerRepo;
    @Override
    public List<Seller> getAll() {
        return sellerRepo.findAll();
    }

    @Override
    public Optional<Seller> getById(Long id) {
        return sellerRepo.findById(id);
    }

    @Override
    public void addSeller(Seller seller) {
sellerRepo.save(seller);
    }

    @Override
    public void deleteById(long id) {
sellerRepo.deleteById(id);
    }
}
