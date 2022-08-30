package com.bootcamp.bank.accounts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/accounts")
@Getter
@Setter
public class AccountsController {

	@Value("${app.testProp}")
	private String testProp;
	
}
