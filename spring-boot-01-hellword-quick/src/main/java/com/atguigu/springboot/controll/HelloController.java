package com.atguigu.springboot.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Harry
 * @Date: 2019-04-27 13:51
 * @Version 1.0
 */


//@ResponseBody//这个类的所有方法返回的数据直接写给浏览器(如果是对象还可以转换为JSON数据)
//@Controller
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }
}