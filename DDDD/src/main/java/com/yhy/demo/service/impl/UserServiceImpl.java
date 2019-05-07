package com.yhy.demo.service.impl;

import com.yhy.demo.domain.User;
import com.yhy.demo.mapper.UserMapper;
import com.yhy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Harry
 * @Date: 2019-05-07 16:14
 * @Version 1.0
 */

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<User> getAllByName(String name) {
        return userMapper.getOne(name);
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }


}