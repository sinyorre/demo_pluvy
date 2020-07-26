package com.example.demo.service;

import com.example.demo.entity.Company;
import com.example.demo.entity.User_Entity;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        users.put("sinan", new User("0551", "123", new ArrayList<>()));
    }

    public User getUserByUsername(String username) {
        return users.get(username);
    }
}
