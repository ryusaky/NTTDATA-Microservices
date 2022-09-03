package com.bootcamp.bank.customers.service.implement;

import org.springframework.stereotype.Service;

import com.bootcamp.bank.components.base.services.SimpleServiceImpl;
import com.bootcamp.bank.components.common.globals.dto.CustomerDto;
import com.bootcamp.bank.customers.entity.Customer;
import com.bootcamp.bank.customers.mapper.ICustomerMapper;
import com.bootcamp.bank.customers.repository.ICustomerRepository;
import com.bootcamp.bank.customers.service.ICustomerService;

@Service 
public class CustomerServiceImpl extends SimpleServiceImpl<CustomerDto, Customer, String, ICustomerMapper, ICustomerRepository> implements ICustomerService{

}
