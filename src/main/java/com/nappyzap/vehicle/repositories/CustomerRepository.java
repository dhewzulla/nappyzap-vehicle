package com.nappyzap.vehicle.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nappyzap.vehicle.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    
}
