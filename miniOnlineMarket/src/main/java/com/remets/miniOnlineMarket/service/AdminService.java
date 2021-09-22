package com.remets.miniOnlineMarket.service;


import com.remets.miniOnlineMarket.domain.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    public List<Admin> getAll();

    public Optional<Admin> getById(Long id);

    public void addAdmin(Admin admin);

    public void deleteById(long id);
}
