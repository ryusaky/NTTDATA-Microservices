package com.bootcamp.bank.accounts.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.bank.accounts.entity.Account;

public interface IAccountRepository extends ReactiveMongoRepository<Account, String>{

}
