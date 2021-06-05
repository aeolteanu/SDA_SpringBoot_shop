package com.SDA.alexolteanu.webshop.service;

import com.SDA.alexolteanu.webshop.model.Account;
import com.SDA.alexolteanu.webshop.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final AccountRepository accountRepository;

    //INJECTED BY SPRING THROUGH THE CONSTRUCTOR
    public CustomerService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;

    }

    public void addCustomer(Account account) {
        accountRepository.save(account);

    }

    public List<Account> getCustomerAccount() {
        return accountRepository.getAll();
    }
}
