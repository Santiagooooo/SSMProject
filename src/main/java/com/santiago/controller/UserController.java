package com.santiago.controller;

import com.santiago.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    public String queryAll(){
        System.out.println("UserController.queryAll查询全部数据");
        userService.queryAll();
        return "success";
    }
}
