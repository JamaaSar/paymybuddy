package com.paymybuddy.paymybuddy.repository;

import com.paymybuddy.paymybuddy.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
