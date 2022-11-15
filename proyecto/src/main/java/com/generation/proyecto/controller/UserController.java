package com.generation.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyecto.model.User;
import com.generation.proyecto.service.UserService;

@RestController
public class UserController {
    public UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
        userService.add(new User(1, "juan", "Barrias"));
        userService.add(new User(12, "manolito", "Barrias"));

    }

    @GetMapping("/user")
    public User getUser() {
        return userService.getUser(0);
    }
    @GetMapping("/AllUser")
    public List<User> getAllUser(){
        return userService.getAll();
    }
}

