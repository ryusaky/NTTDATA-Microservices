package com.bootcamp.bank.customers.mapper.implement;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.bootcamp.bank.components.common.globals.dto.CustomerDto;
import com.bootcamp.bank.customers.entity.Customer;
import com.bootcamp.bank.customers.mapper.ICustomerMapper;

@Component
public class CustomerMapperImpl implements ICustomerMapper{

	@Override
	public CustomerDto entityToDto(Customer entity) {
		CustomerDto dto = CustomerDto.builder().build();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

	@Override
	public Customer dtoToEntity(CustomerDto dto) {
		Customer entity = Customer.builder().build();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

}
