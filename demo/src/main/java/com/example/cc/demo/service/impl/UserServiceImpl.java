package com.example.cc.demo.service.impl;

import com.example.cc.demo.entity.User;
import com.example.cc.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String addUser(User user) {
        return "success";
    }
}
