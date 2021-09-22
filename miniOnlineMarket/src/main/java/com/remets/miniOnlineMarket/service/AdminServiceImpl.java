package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Admin;
import com.remets.miniOnlineMarket.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminRepo adminRepo;


    @Override
    public List<Admin> getAll() {
        return null;
    }

    @Override
    public Optional<Admin> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public void addAdmin(Admin admin) {

    }

    @Override
    public void deleteById(long id) {

    }
}

