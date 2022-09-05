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
public class CustomerDto extends BaseDto{
	private String id;
	private String name;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String documentType;
	private String documentNumber;
	private String perfil;
	
}
