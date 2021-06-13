package com.SDA.alexolteanu.webshop.service;

import com.SDA.alexolteanu.webshop.model.*;
import com.SDA.alexolteanu.webshop.repository.BillRepository;
import com.SDA.alexolteanu.webshop.repository.OrderRepository;


import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final BillRepository billRepository;

    public OrderService(OrderRepository orderRepository, BillRepository billRepository) {
        this.orderRepository = orderRepository;
        this.billRepository = billRepository;
    }

    public void save(Customer customer, List<Product> products) {
        Bill bill = new Bill();
        bill.setIssueDate(Timestamp.from(Instant.now()));
        // bill.setDueDate(Timestamp.from(Instant.now().plus(7, ChronoUnit.DAYS))); prima varianta
        bill.setDueDate(Timestamp.from(Instant.now().plus(Duration.ofDays(7))));   // doua varianta
        bill.setCurrency(products.get(0).getCurrency());
        double total = 0;
        for (Product product : products) {
            total = total + product.getPrice();
        }
        bill.setAmount(total);
        billRepository.save(bill);


        Order order = new Order();
        order.setProducts(products);
        order.setStatus(OrderStatus.NEW);
        order.setCreationDate(Timestamp.from(Instant.now()));
        order.setCustomer(customer);
        order.setBill(bill);
        orderRepository.save(order);

    }


}
