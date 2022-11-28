package com.begin.projectA.Controller;

import com.begin.projectA.Service.UserService;
import com.begin.projectA.config.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    /*@RequestMapping("/login")
    public String login() {
        return "login";
    }*/

    @RequestMapping("/registration")
    public String registration() {
        return "registration";
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }
}
