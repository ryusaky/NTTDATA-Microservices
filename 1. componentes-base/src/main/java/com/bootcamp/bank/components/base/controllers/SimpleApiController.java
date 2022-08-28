package com.bootcamp.bank.components.base.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootcamp.bank.components.base.services.ICRUD;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class SimpleApiController<Dto,V,I extends ICRUD<Dto, V>> {
	
	@Autowired
	protected I _service;
	
	@GetMapping(value="/getall")
	public Flux<Dto> getall(){
		return (Flux<Dto>) _service.findAll();
	}
	
	@PostMapping(value = "/add")
	public Mono<Dto> add(@RequestBody Mono<Dto> dto){
		return _service.save(dto);
	}
	
	@GetMapping(value="/get/{id}")
	public Mono<Dto> get(@PathVariable V id){
		return _service.findById(id);
	}

	
	@PutMapping(value="/update/{id}")
	public Mono<Dto> update(@RequestBody Mono<Dto> dto,@PathVariable V id){
		return _service.update(dto, id);
	}
	
	@GetMapping(value = "/delete/{afpid}")
	public Mono<Void> delete(@PathVariable V id) {
		return _service.delete(id);
	}
}
