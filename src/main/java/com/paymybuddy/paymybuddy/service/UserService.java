package com.paymybuddy.paymybuddy.service;

import com.paymybuddy.paymybuddy.entities.Account;
import com.paymybuddy.paymybuddy.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    UserDetailsService userDetailsService();

    public User add(User user);

    public Iterable<User> get();

    public List<User> getList() ;


    public void addFriend(Integer userId, String friendEmail) throws Exception;


    public void addAccount(Integer userId, Account account) ;


}
