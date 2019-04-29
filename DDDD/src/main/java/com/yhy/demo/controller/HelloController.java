package com.yhy.demo.controller;

import com.yhy.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Harry
 * @Date: 2019-04-29 15:51
 * @Version 1.0
 */


@RestController
public class HelloController {

    @GetMapping(value = "/user")
    public User getUser(@RequestBody User user2){
        User user = new User();

        user.setName("yhy");
        user.setPassword("123456");

        return user2;
    }
}