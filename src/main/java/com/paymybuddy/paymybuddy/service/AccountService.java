package com.paymybuddy.paymybuddy.service;

import com.paymybuddy.paymybuddy.entities.Account;
import com.paymybuddy.paymybuddy.repository.AccountRepository;
import com.paymybuddy.paymybuddy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface AccountService {


     Iterable<Account> getAccount();



}
