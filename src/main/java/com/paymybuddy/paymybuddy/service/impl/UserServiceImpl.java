package com.paymybuddy.paymybuddy.service.impl;

import com.paymybuddy.paymybuddy.entities.Account;
import com.paymybuddy.paymybuddy.entities.User;
import com.paymybuddy.paymybuddy.repository.UserRepository;
import com.paymybuddy.paymybuddy.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return userRepository.findByEmail(username)
                       ;
            }
        };
    }

    public User add(User user) {
        return userRepository.save(user);
    }
    public Iterable<User> get() {
        return userRepository.findAll();
    }
    public List<User> getList() {
        return userRepository.findAll();
    }

    public void addFriend(Integer userId, String friendEmail) throws Exception {
        User user = userRepository.findById(userId).orElseThrow();
        User friend;
        friend = userRepository.findByEmail(friendEmail);

  if(user.getFriends().contains(friend)){
            throw new Exception("you cant add one person twice");
        }
        if(!user.getEmail().equals(friendEmail)){
            List<User> friendsList = user.getFriends();
            friendsList.add(friend);
            user.setFriends(friendsList);
            userRepository.save(user);
        }else{
            throw new Exception("you cant add yourself as friend");
        }
    }

    public void addAccount(Integer userId, Account account) {
        User user = userRepository.findById(userId).orElseThrow();

        user.setAccount(account);
        userRepository.save(user);
    }
}
