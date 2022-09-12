package com.bootcamp.bank.components.base.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootcamp.bank.components.base.services.ICRUD;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class SimpleApiController<Dto,V,I extends ICRUD<Dto, V>> {
	
	protected static final Logger _logger= LoggerFactory.getLogger(SimpleApiController.class);  
	
	@Autowired
	protected I _service;
		
	@GetMapping(value="/getall")
	public ResponseEntity<Flux<Dto>> getall(){
		_logger.info("Clase {} : Se accedió al método {} , con tipo de solicitud {}", 
				this.getClass().asSubclass(this.getClass()).getSimpleName(),
				"/getall", "GET");
		return new ResponseEntity<Flux<Dto>>(_service.findAll(),HttpStatus.OK);
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<Mono<Dto>> add(Mono<Dto> dto){
		_logger.info("Clase {} : Se accedió al método {} , con tipo de solicitud {}", 
				this.getClass().asSubclass(this.getClass()).getSimpleName(),
				"/add", "POST");
		return new ResponseEntity<Mono<Dto>>(_service.save(dto),HttpStatus.CREATED);
	}
	
	@GetMapping(value="/get/{id}")
	public ResponseEntity<Mono<Dto>> get(@PathVariable V id){
		return new ResponseEntity<Mono<Dto>>(_service.findById(id),HttpStatus.OK);
	}

	
	@PutMapping(value="/update/{id}")
	public ResponseEntity<Mono<Dto>> update(@RequestBody Mono<Dto> dto,@PathVariable V id){
		return new ResponseEntity<Mono<Dto>>(_service.update(dto, id),HttpStatus.OK);
	}
	
	@GetMapping(value = "/delete/{afpid}")
	public ResponseEntity<Mono<Void>> delete(@PathVariable V id) {
		return new ResponseEntity<Mono<Void>>(_service.delete(id), HttpStatus.OK);
	}
}
