package com.santiago.dao;

import com.santiago.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    public void insertUser(User user);
    @Select("select * from user")
    public List<User> queryAll();
}
