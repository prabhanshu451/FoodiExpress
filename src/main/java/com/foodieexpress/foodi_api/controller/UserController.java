package com.foodieexpress.foodi_api.controller;

import com.foodieexpress.foodi_api.model.User;
import com.foodieexpress.foodi_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

@PostMapping("/login")
public String loginUser(@RequestParam String email, @RequestParam String password) {
    return userService.loginUser(email, password);
}
}

