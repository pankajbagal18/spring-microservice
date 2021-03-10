package com.example.spring.restful.webservice.controllers;

import com.example.spring.restful.webservice.entity.User;
import com.example.spring.restful.webservice.exceptions.UserNotFoundException;
import com.example.spring.restful.webservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/all")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(path="{id}")
    public User findOne(@PathVariable Integer id){
        final User user = userService.findOne(id);
        if(user==null) {
            throw new UserNotFoundException(id);
        }
        return user;
    }

    @PostMapping(path = "/save")
    public void save(@RequestBody User user){
        userService.save(user);
    }
}