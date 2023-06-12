package com.example.springaop.controller;

import com.example.springaop.aop.ServiceA;
import com.example.springaop.aop.ServiceB;
import com.example.springaop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    ServiceA serviceA;

    @Autowired
    ServiceB serviceB;


    @RequestMapping("list")
    @ResponseBody
    public Object list(){
        return userService.listAll();
    }

    @RequestMapping("save")
    @ResponseBody
    public Object save(){
        userService.save();
        return "aa";
    }

    @RequestMapping("service")
    public Object service(){
        serviceA.transaction();
        serviceB.test();
        return "hello";
    }

    @RequestMapping("private")
    public Object priv(){
        return "1";
    }

}
