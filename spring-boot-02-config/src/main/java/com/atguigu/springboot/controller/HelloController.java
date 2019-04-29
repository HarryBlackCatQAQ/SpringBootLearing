package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Harry
 * @Date: 2019-04-29 14:07
 * @Version 1.0
 */

@RestController
public class HelloController {
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello " + name;
    }
}