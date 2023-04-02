package com.example.simpleapp.controller;

import com.example.simpleapp.model.User;
import com.example.simpleapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/getAll")
    public List<User> list() {
        return userService.listAllUser();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userService.saveUser(user);
    }
}
