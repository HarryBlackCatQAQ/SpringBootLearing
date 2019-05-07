package com.yhy.demo.controller;

import com.yhy.demo.domain.User;
import com.yhy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Harry
 * @Date: 2019-04-29 15:51
 * @Version 1.0
 */


@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user2")//@RequestBody User user2      String name,String password
    public User getUser2(@RequestBody User user2){

//        return new User();

        userService.save(user2);
        System.out.println(user2);
        return user2;
    }


    @GetMapping(value = "/user")
    public User getUser(String name,String password){
        User user = new User();

        user.setName(name);
        user.setPassword(password);

        System.out.println(user);
        return user;
    }
}