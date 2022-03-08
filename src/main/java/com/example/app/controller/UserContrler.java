package com.example.app.controller;
import com.example.app.entities.User;
import com.example.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/user")


public class UserContrler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll();
        return users;
    }

    }




