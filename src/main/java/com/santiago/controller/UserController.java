package com.santiago.controller;

import com.santiago.entity.User;
import com.santiago.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    public String queryAll(Model model){
        System.out.println("UserController.queryAll查询全部数据");
        List<User> users = userService.queryAll();
        model.addAttribute("users", users);
        return "success";
    }

    @RequestMapping("/insert")
    public String insert(User user){
        System.out.println("UserController.insert插入数据");
        userService.insertUser(user);
        return "success";
    }
}
