package com.SDA.alexolteanu.webshop.repository;

import com.SDA.alexolteanu.webshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
