package com.paymybuddy.paymybuddy.controller;


import com.paymybuddy.paymybuddy.entities.Account;
import com.paymybuddy.paymybuddy.entities.User;
import com.paymybuddy.paymybuddy.service.AccountService;
import com.paymybuddy.paymybuddy.service.UserService;
import com.paymybuddy.paymybuddy.service.impl.AccountServiceImpl;
import com.paymybuddy.paymybuddy.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;


    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.add(user));
    }

    @GetMapping
    public ResponseEntity<Iterable<User>> get() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.get());
    }

    @PostMapping("/{id}/addFriend/{friendEmail}")
    public void addFriend(@PathVariable("id") Integer userId,
                                    @PathVariable("friendEmail") String friendEmail)
            throws Exception {
         userService.addFriend(userId,friendEmail);
    }

    @PostMapping("/{id}/createAccount")
    public void addAccount(@PathVariable("id") Integer userId,
                           @RequestBody Account account) {
        userService.addAccount(userId,account);
    }


}
