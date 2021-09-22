package com.remets.miniOnlineMarket.repository;

import com.remets.miniOnlineMarket.domain.Admin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminRepo extends CrudRepository<Admin, Long> {
    public List<Admin> findAll();
}
