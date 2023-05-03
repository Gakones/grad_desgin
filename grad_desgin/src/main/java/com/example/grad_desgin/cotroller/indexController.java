package com.example.grad_desgin.cotroller;

import com.example.grad_desgin.mapper.UserMapper;
import com.example.grad_desgin.pojo.User;
import com.example.grad_desgin.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/test")
public class indexController {
    @Autowired
    UserSerivce userSerivce;

    @GetMapping("/testdate")
    public List<User> testdate() {
        return userSerivce.getAlluser();
    }
}
