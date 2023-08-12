package com.paymybuddy.paymybuddy.service;

import com.paymybuddy.paymybuddy.dao.request.SignUpRequest;
import com.paymybuddy.paymybuddy.dao.request.SigninRequest;
import com.paymybuddy.paymybuddy.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
