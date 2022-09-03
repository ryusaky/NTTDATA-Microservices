package com.bootcamp.bank.customers.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.bank.customers.entity.Customer;

@Repository
public interface ICustomerRepository extends ReactiveMongoRepository<Customer, String>{

}
