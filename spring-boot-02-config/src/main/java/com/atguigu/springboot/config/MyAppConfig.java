package com.atguigu.springboot.config;

import com.atguigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Harry
 * @Date: 2019-04-29 14:26
 * @Version 1.0
 */


/**
 * @Configuration:指命当前类是一个配置类：就是来代替之前的Spring配置文件
 *
 * 在配置文件中用<bean></bean>标签添加组件
 */

@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中；容器中这个组件默认的ID是方法名
    @Bean
    public HelloService helloService02(){
        System.out.println("配置类@Bean给容器添加了组件。。。");
        return new HelloService();
    }
}