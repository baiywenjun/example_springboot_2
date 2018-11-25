package com.backend.springboot_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 15:41
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/error1")
    public String error1() throws FileNotFoundException {
        throw new FileNotFoundException("");
    }

    @GetMapping("/error2")
    public String error2() throws ClassNotFoundException {
        throw new ClassNotFoundException("");
    }

    @GetMapping("/home")
    public String home(){
        return "book_home";
    }
}
