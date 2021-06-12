package com.SDA.alexolteanu.webshop.repository;

import com.SDA.alexolteanu.webshop.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}