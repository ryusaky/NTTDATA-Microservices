package com.bootcamp.bank.accounts.mapper.implement;

import org.springframework.beans.BeanUtils;

import com.bootcamp.bank.accounts.entity.Account;
import com.bootcamp.bank.accounts.mapper.IAccountMapper;
import com.bootcamp.bank.components.common.globals.dto.AccountDto;

public class AccountMapperImpl implements IAccountMapper{

	@Override
	public AccountDto entityToDto(Account entity) {
		AccountDto dto = AccountDto.builder().build();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

	@Override
	public Account dtoToEntity(AccountDto dto) {
		Account entity = Account.builder().build();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

}
