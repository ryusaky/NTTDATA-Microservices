package com.bootcamp.bank.accounts.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.bootcamp.bank.components.common.globals.dto.CustomerDto;

import reactor.core.publisher.Mono;

@Service
public class MyCustomerWebClient {

	private static final Logger logger = LoggerFactory.getLogger(MyCustomerWebClient.class);

	private final WebClient.Builder loadBalancedWebClientBuilder;

	private static String nameService = "customer";

	private static final String courseMisroserviceBaseURL = "http://localhost/";

	private static String pathBase = courseMisroserviceBaseURL + nameService;
	
	private static String getAll = pathBase + "/getall";

	public MyCustomerWebClient(WebClient.Builder webClientBuilder, ReactorLoadBalancerExchangeFilterFunction lbFunction) {
		this.loadBalancedWebClientBuilder = webClientBuilder;
	}

	public Mono<CustomerDto> getCourseDetails(int courseId) {
		logger.info("calling course microservice API using Web-Client");

		return loadBalancedWebClientBuilder.build().get().uri(getAll+ "/id?id=" + courseId).retrieve()
				.bodyToMono(CustomerDto.class);
	}
}
