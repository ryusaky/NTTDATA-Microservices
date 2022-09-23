package com.bootcamp.bank.accounts.client;

import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.bootcamp.bank.components.base.clients.SimpleClientAPI;
import com.bootcamp.bank.components.common.globals.dto.CustomerDto;

public class CustomerWebClient extends SimpleClientAPI<CustomerDto, String>{

	public CustomerWebClient(Builder webClientBuilder, ReactorLoadBalancerExchangeFilterFunction lbFunction) {
		super(webClientBuilder, lbFunction, "http://localhost:8080/api/", "customers");
	}

}
