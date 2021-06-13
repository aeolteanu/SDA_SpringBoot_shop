package com.SDA.alexolteanu.webshop.repository;

import com.SDA.alexolteanu.webshop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
