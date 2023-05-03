package com.example.grad_desgin.service;

import com.example.grad_desgin.mapper.UserMapper;
import com.example.grad_desgin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSerivce {
    @Autowired
    UserMapper userMapper;

    public List<User> getAlluser(){
        return userMapper.getAllUser();
    }
}
