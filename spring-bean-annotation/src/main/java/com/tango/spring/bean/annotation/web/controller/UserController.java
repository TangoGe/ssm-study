package com.tango.spring.bean.annotation.web.controller;

import com.tango.spring.bean.annotation.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    public void save() {
        userService.save();
    }
}
