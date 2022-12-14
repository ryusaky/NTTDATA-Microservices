package com.bootcamp.bank.components.common.globals.dto;

import com.bootcamp.bank.components.dto.BaseDto;

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
public class AccountDto extends BaseDto{

	private String id;
	private short accountType;
	private short operationsLimit;
	private double maintenance;
}
