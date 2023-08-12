package com.paymybuddy.paymybuddy.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.paymybuddy.paymybuddy.dao.request.SignUpRequest;
import com.paymybuddy.paymybuddy.dao.request.SigninRequest;
import com.paymybuddy.paymybuddy.dao.response.JwtAuthenticationResponse;
import com.paymybuddy.paymybuddy.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignUpRequest request) {
    authenticationService.signup(request);
        return ResponseEntity.ok("User registered successfully!");

    }

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody SigninRequest request) {
        JwtAuthenticationResponse jwtAuthenticationResponse =
                authenticationService.signin(request);

        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtAuthenticationResponse.toString())
                .body("You've been signed!");
    }
}
