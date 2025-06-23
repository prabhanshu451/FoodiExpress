package com.foodieexpress.foodi_api.service;

import com.foodieexpress.foodi_api.model.User;
import com.foodieexpress.foodi_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return "❌ Email already registered!";
        }
        userRepository.save(user);
        return "✅ User registered successfully!";
    }
}

