package com.bootcamp.bank.accounts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/category")
@Getter
@Setter
public class CateogoryController {

	@Value("${app.testProp}")
	private String testProp;
	
	@GetMapping
	public String getTestProp() {
		return this.testProp;
	}
}
