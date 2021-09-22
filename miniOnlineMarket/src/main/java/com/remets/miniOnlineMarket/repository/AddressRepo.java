package com.remets.miniOnlineMarket.repository;

import com.remets.miniOnlineMarket.domain.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepo extends CrudRepository<Address, Long> {
    public List<Address> findAll();
}
