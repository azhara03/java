package com.begin.projectA.Controller;
import com.begin.projectA.Entity.Employee;
import com.begin.projectA.Entity.Sales;
import com.begin.projectA.Entity.User;
import com.begin.projectA.Model.AuthRequest;
import com.begin.projectA.Model.AuthResponse;
import com.begin.projectA.Service.UserService;
import com.begin.projectA.config.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
@PreAuthorize("hasAuthority('USER')")
public class UserController {
    @Autowired
    private final UserService userService;


    @GetMapping("all")
    public List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/profile")
    public String profile(Principal principal,
                          Model model) {
        User user = userService.getUserByPrincipal(principal);
        model.addAttribute("user", user);
        return "profile";
    }
}
