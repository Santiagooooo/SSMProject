package com.santiago.service;

import com.santiago.entity.User;

import java.util.List;

public interface UserService {

    public void updatePassword(String uid, String oldPass,String newPass) throws Exception;

    public User login(User user);

    public void activation(String code)throws Exception;

    public boolean ajaxValidateLoginname(String loginname);

    public boolean ajaxValidateEmail(String email);

    public void regist(User user) throws Exception;

}