package com.begin.projectA.Controller;

import com.begin.projectA.Model.AuthRequest;
import com.begin.projectA.Entity.User;
import com.begin.projectA.Model.AuthResponse;
import com.begin.projectA.Repository.UserRepository;
import com.begin.projectA.Service.UserService;
import com.begin.projectA.config.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtProvider jwtProvider;

    public AuthController(UserService userService, JwtProvider jwtProvider) {
        this.userService = userService;
        this.jwtProvider = jwtProvider;
    }

    @PostMapping("/login")
    public AuthResponse login(AuthRequest request) {
        User user = userService.findByLoginAndPassword(request.getEmail(), request.getPassword());
        String token = jwtProvider.generateToken(user.getEmail());
        //return jwtProvider.generateToken(request.getEmail());
        return new AuthResponse(token);
    }
}