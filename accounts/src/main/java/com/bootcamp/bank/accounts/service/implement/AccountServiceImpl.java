package com.bootcamp.bank.accounts.service.implement;

import com.bootcamp.bank.accounts.entity.Account;
import com.bootcamp.bank.accounts.mapper.IAccountMapper;
import com.bootcamp.bank.accounts.repository.IAccountRepository;
import com.bootcamp.bank.accounts.service.IAccountService;
import com.bootcamp.bank.components.base.services.SimpleServiceImpl;
import com.bootcamp.bank.components.common.globals.dto.AccountDto;

public class AccountServiceImpl extends SimpleServiceImpl<AccountDto, Account, String, IAccountMapper, IAccountRepository> implements IAccountService{

}
