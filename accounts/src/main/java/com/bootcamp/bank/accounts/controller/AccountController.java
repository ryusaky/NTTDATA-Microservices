package com.bootcamp.bank.accounts.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bank.accounts.service.IAccountService;
import com.bootcamp.bank.components.base.controllers.SimpleApiController;
import com.bootcamp.bank.components.common.globals.dto.AccountDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/${app.route-account.name}/${app.versionMs}")
public class AccountController extends SimpleApiController<AccountDto, String,IAccountService>{

	@Override
	public ResponseEntity<Mono<AccountDto>> add(Mono<AccountDto> dto) {
		// TODO Auto-generated method stub
		return super.add(dto);
	}
	
}
