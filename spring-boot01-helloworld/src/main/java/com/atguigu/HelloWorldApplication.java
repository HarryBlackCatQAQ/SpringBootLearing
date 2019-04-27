package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Harry
 * @Date: 2019-04-27 11:58
 * @Version 1.0
 */


/*
* @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
*/


//SpringBoot应用标注在某个类上是SpringBoot的主配置类，SpringBoot就应该运行这个类的main方法来启动SpringBoot应用
@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {

        //Spring应用启动起来
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}