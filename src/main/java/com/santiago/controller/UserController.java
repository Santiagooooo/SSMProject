package com.santiago.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/queryAll")
    public String queryAll(){
        System.out.println("UserController.queryAll查询全部数据");
        return "success";
    }
}
