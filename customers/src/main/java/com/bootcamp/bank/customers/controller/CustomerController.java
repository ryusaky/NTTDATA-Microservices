package com.bootcamp.bank.customers.controller;


import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bank.components.base.controllers.SimpleApiController;
import com.bootcamp.bank.components.common.globals.dto.CustomerDto;
import com.bootcamp.bank.customers.service.ICustomerService;

@RestController
@RequestMapping("/api/${app.route-customer.name}/${app.versionMs}")
public class CustomerController extends SimpleApiController<CustomerDto, String,ICustomerService>{

/*
	@PostMapping(value="test")
	public Mono<CustomerDto> testmethod(RequestEntity<Mono<CustomerDto>> req) {
		_logger.info("Clase {} : Se accedió al método {} , con tipo de solicitud {}", 
				this.getClass().asSubclass(this.getClass()).getSimpleName(),
				req.getUrl().getPath().replaceAll(".", ""),
				req.getMethod()
				);
		return req.getBody();
	}
*/	
	@GetMapping(value="test2")
	public  String testmethod2(){
		return "hola mundo";
	}
}