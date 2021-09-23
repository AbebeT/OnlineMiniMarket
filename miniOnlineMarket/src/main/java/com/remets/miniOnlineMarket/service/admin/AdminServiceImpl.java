package com.remets.miniOnlineMarket.service.admin;

import com.remets.miniOnlineMarket.domain.Admin;
import com.remets.miniOnlineMarket.domain.Seller;
import com.remets.miniOnlineMarket.repository.AdminRepo;
import com.remets.miniOnlineMarket.repository.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;
    @Autowired
    SellerRepo sellerRepo;

    @Override
    public List<Admin> getAll() {
        return null;
    }

    @Override
    public void addAdmin(Admin admin) {
        adminRepo.save(admin);
    }

//    @Override
//    public Optional<Admin> getById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public void addAdmin(Admin admin) {
//
//    }
//
//    @Override
//    public void deleteById(long id) {
//
//    }

//    @Override
//    public void approveSeller(Long id) {
//        Seller seller = sellerRepo.findById(id).get();
//        seller.setApproved(true);
//        sellerRepo.save(seller);
//    }
}

