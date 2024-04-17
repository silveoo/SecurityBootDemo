package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.Impl.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/new-user")
    public String addUser(@RequestBody Users user){
        userService.addUser(user);
        return "User " + user.getName() + " was added!";
    }
}
