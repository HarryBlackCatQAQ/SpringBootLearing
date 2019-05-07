package com.yhy.demo.service;

import com.yhy.demo.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    List<User> getAllByName(String name);

    void save(User user);
}
