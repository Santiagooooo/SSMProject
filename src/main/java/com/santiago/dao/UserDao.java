package com.santiago.dao;

import com.santiago.entity.User;

import java.util.List;

public interface UserDao {

    public void insertUser(User user);
    public List<User> queryAll();
}
