package com.remets.miniOnlineMarket.controller;

import com.remets.miniOnlineMarket.domain.Address;
import com.remets.miniOnlineMarket.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;
@GetMapping
public List<Address> getAll() {
    return addressService.getAll();
}

@GetMapping("/{id}")
    public Optional<Address> getById(@PathVariable long id)
{
        return addressService.getById(id);
    }

   @PostMapping
    public void addAddress(@RequestBody Address address) {
        addressService.addAddress(address);

    }

   @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        addressService.deleteById(id);

    }
}


