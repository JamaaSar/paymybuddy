package com.paymybuddy.paymybuddy.service.impl;

import com.paymybuddy.paymybuddy.entities.Account;
import com.paymybuddy.paymybuddy.entities.TypeOfPayment;
import com.paymybuddy.paymybuddy.repository.AccountRepository;
import com.paymybuddy.paymybuddy.repository.UserRepository;
import com.paymybuddy.paymybuddy.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private UserRepository userRepository;



@Override
    public void makePayment(Account account, TypeOfPayment type) {

    }

}
