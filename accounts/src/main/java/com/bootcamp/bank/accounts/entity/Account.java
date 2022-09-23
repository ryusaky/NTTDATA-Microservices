package com.bootcamp.bank.accounts.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "accounts")
public class Account {
	@Id
	private String id;
	private short accountType;
	private short operationsLimit;
	private double maintenance;
	
}
