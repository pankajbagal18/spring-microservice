package com.example.spring.restful.webservice.service;

import com.example.spring.restful.webservice.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class UserServiceTest {

    private UserService userService;
    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void findOne() {
        User firstUser = userService.findOne(1);
        assertEquals(User.class,firstUser.getClass());
        assertEquals(firstUser.getName(),"A");
    }
}