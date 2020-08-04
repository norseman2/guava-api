package com.guava.api.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//extends PagingAndSortingRepository
public interface AccountRepository extends CrudRepository <Account, Long> {

  List<Account> findByAccountNumber(String accountNumber);

  List<Account> findByAccountName(String accountName);

  List<Account> findByAccountNumberAndAccountName(String accountNumber, String accountName); 

  List<Account> findByAccountNameOrderByAccountNameAsc(String accountName);

  /*
  @Query("select a from Account a where a.account_name = ?1")
  List<Account> findByAccountName(String accountName);  
  */
}