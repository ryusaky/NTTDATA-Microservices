package com.bootcamp.bank.components.base.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.bootcamp.bank.components.common.globals.Generals;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class SimpleClientAPI<Dto, V> {

	private static final Logger _logger = LoggerFactory.getLogger(SimpleClientAPI.class);
	private final WebClient.Builder loadBalancedWebClientBuilder;

	private String _nameService;
	private String _urlRequest;

	public SimpleClientAPI(WebClient.Builder webClientBuilder, ReactorLoadBalancerExchangeFilterFunction lbFunction,
			String host, String nameService) {
		this.loadBalancedWebClientBuilder = webClientBuilder;
		_nameService = nameService; // this.getClass().asSubclass(this.getClass()).getSimpleName();
		_urlRequest = host + _nameService;
	}

	public Mono<Dto> callGet(V id, Class<Dto> elementClass) {
		_logger.info("calling Method {} from controller {}", Generals.PathUrl.GET_BY_ID, _nameService);
		return loadBalancedWebClientBuilder.build().get().uri(_urlRequest + Generals.PathUrl.GET_BY_ID + "/" + id)
				.retrieve().bodyToMono(elementClass);
	}

	public Flux<Dto> callGetAll(Class<Dto> elementClass) {
		_logger.info("calling Method {} from controller {}", Generals.PathUrl.GET_ALL, _nameService);
		return loadBalancedWebClientBuilder.build().get().uri(_urlRequest + Generals.PathUrl.GET_ALL).retrieve()
				.bodyToFlux(elementClass);
	}
	
	public Mono<Dto> callAdd(Mono<Dto> dto, Class<Dto> elementClass){
		_logger.info("calling Method {} from controller {}", Generals.PathUrl.ADD, _nameService);
		return loadBalancedWebClientBuilder.build()
				.post()
				//.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.uri(_urlRequest + Generals.PathUrl.ADD)
				.body(BodyInserters.fromValue(dto), elementClass)
				.retrieve()
				.bodyToMono(elementClass);
	}
	
	public Mono<Dto> callUpdate(Mono<Dto> dto, V id, Class<Dto> elementClass){
		_logger.info("calling Method {} from controller {}", Generals.PathUrl.ADD, _nameService);
		return loadBalancedWebClientBuilder.build()
				.put()
				//.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.uri(_urlRequest + Generals.PathUrl.UPDATE +"/"+id)
				.body(dto, elementClass)
				.retrieve()
				.bodyToMono(elementClass);
	}
	
	/*
	 * public Mono<Void> callDelete(V id){
	 * 
	 * }
	 */
	
}
