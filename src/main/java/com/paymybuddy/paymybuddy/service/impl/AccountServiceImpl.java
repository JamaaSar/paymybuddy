package com.paymybuddy.paymybuddy.service.impl;

import com.paymybuddy.paymybuddy.entities.Account;
import com.paymybuddy.paymybuddy.repository.AccountRepository;
import com.paymybuddy.paymybuddy.repository.UserRepository;
import com.paymybuddy.paymybuddy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private UserRepository userRepository;



    @Override
    public Iterable<Account> getAccount() {
        return accountRepository.findAll();
    }



}
