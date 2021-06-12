package com.SDA.alexolteanu.webshop.repository;

import com.SDA.alexolteanu.webshop.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {

    List<Account> findAllByIsClosed(Boolean isClosed);

    List<Account> findByBillingAdress(String billingAdress);

    List<Account> findAllByCreationDateBetween(Date startDate, Date endDate);

    List<Account> findAllByBillingAdressIsContaining(String city);


}
