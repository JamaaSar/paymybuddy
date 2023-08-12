package com.paymybuddy.paymybuddy.repository;


import com.paymybuddy.paymybuddy.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
