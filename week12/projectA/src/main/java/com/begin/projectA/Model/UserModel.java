package com.begin.projectA.Model;
import com.begin.projectA.Entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel {
    private int id;
    private String name;
    private String phoneNumber;
    private boolean active;
    private String email;
    private String password;
    private Role role;
}
