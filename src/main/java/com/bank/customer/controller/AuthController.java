package com.bank.customer.controller;

import com.bank.customer.utils.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("root");
        String password = credentials.get("Test@1234");

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        String token = jwtUtil.generateToken(username);

        return Map.of("token", token);
    }
}
