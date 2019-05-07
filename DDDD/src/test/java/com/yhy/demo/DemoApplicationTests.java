package com.yhy.demo;

import com.yhy.demo.domain.User;
import com.yhy.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void contextLoads() {
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.getAll();
        for(User user :users){
            System.err.println(user);
        }

        users = userMapper.getOne("hhr");
        for(User user:users){
            System.err.println(user);
        }
    }

    @Test
    public void testInsert() throws Exception{
        User user = new User();
        user.setName("zaz");
        user.setPassword("444444");

        userMapper.insert(user);
    }

}
