package com.backend.springboot_2.controller;

import com.backend.springboot_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 13:12
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("username","admin");
        model.addAttribute("nickname","Lucy");
        return "login";
    }

    @GetMapping("/help")
    public String help(){
        throw new IllegalArgumentException("args is empty");
    }

    @GetMapping("/add")
    @ResponseBody
    public String addUser(){
        boolean flag = userService.addUser("admin", "Lucy");
        return flag?"ok":"error";
    }
}
