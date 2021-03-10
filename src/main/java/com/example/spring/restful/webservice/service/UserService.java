package com.example.spring.restful.webservice.service;

import com.example.spring.restful.webservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService {
    private static final List<User> users = new ArrayList<>();
    public static int USER_COUNT=0;
    static {
        users.add(new User(1, "A",new Date()));
        users.add(new User(2, "B",new Date()));
        users.add(new User(3, "C",new Date()));
        USER_COUNT=3;
    };

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        users.add(user);
        ++USER_COUNT;
        return users.get(USER_COUNT-1);
    }

    public User findOne(Integer id){
        return users.stream().filter(u-> u.getId().equals(id)).findFirst().orElse(null);
    }
}
