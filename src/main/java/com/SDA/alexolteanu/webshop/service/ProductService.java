package com.SDA.alexolteanu.webshop.service;

import com.SDA.alexolteanu.webshop.model.Product;
import com.SDA.alexolteanu.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired   // Injected by spring
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public void save(Product product) {
        productRepository.save(product);
    }

    public List<Product> findAll() {
        return StreamSupport.stream(productRepository.findAll().spliterator(),
                false).collect(Collectors.toList());
    }

    public Optional<Product> findById(Long productId) {
        return (productRepository.findById(productId));
    }
}
