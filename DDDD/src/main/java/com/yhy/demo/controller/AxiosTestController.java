package com.yhy.demo.controller;

import com.yhy.demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Harry
 * @Date: 2019-05-06 15:52
 * @Version 1.0
 */

@RestController
public class AxiosTestController {


    @GetMapping(value = "/axios")
    public User getUser(String name,String password){
        User user = new User();

        user.setName(name);
        user.setPassword(password);

        return user;
    }
}