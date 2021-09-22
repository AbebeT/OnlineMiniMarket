package com.remets.miniOnlineMarket.repository;
import com.remets.miniOnlineMarket.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository<Person, Long> {
    public List<Person> findAll();
}
