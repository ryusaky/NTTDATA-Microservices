package com.bootcamp.bank.customers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bank.components.base.controllers.SimpleApiController;
import com.bootcamp.bank.components.common.globals.dto.CustomerDto;
import com.bootcamp.bank.customers.service.ICustomerService;

@RestController
@RequestMapping("/api/${app.route-customer.name}/${app.versionMs}")
public class CustomerController extends SimpleApiController<CustomerDto, String,ICustomerService>{

	
}
