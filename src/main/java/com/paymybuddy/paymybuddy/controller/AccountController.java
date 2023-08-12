package com.paymybuddy.paymybuddy.controller;


import com.paymybuddy.paymybuddy.entities.Account;
import com.paymybuddy.paymybuddy.service.AccountService;
import com.paymybuddy.paymybuddy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<Iterable<Account>> get() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(accountService.getAccount());
    }





}
