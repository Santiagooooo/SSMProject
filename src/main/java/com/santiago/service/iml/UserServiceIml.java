package com.santiago.service.iml;

import com.santiago.entity.User;
import com.santiago.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceIml implements UserService {
    @Override
    public void insertUser(User user) {
        System.out.println("service插入数据");
    }

    @Override
    public List<User> queryAll() {
        System.out.println("service查询全部数据");
        return null;
    }
}
