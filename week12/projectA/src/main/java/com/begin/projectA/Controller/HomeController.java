package com.begin.projectA.Controller;

import com.begin.projectA.Entity.User;
import com.begin.projectA.Service.UserService;
import com.begin.projectA.config.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }



    @GetMapping("/main")
    public String main() {
        return "main";
    }
}
