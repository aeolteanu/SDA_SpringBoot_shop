package com.SDA.alexolteanu.webshop.repository;

import com.SDA.alexolteanu.webshop.model.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepository {
    private List<Account> accountList = new ArrayList<>();
    public List<Account> getAll(){
       return accountList;
    }
    public void save(Account account){
        accountList.add(account);


    }
}
