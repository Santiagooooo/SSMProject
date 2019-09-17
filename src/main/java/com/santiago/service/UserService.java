package com.santiago.service;

import com.santiago.entity.User;

import java.util.List;

public interface UserService {

    public void insertUser(User user);
    public List<User> queryAll();
}
