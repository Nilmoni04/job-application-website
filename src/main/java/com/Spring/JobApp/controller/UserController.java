package com.Spring.JobApp.controller;

import com.Spring.JobApp.model.User;
import com.Spring.JobApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/api/jobs/register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }
}
