package com.santiago.dao;

import com.santiago.entity.User;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.Map;

@Repository
public interface UserDao {

    public boolean findByUidAndLoginpass(Map<String,String> map) throws SQLException;

    public void updateLoginpass(Map<String,String> map) throws SQLException;

    public User findByLoginnameAndLoginpass(Map<String,String> map) throws SQLException;

    public User findByCode(String code) throws SQLException;

    public void updateStatus(Map<String,Object> map) throws SQLException;

    public boolean ajaxValidateLoginname(String loginname) throws SQLException;

    public boolean ajaxValidateEmail(String email) throws SQLException;

    public void add(User user) throws SQLException;
}