package com.backend.springboot_2.service;

import org.springframework.stereotype.Service;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 17:14
 */
@Service
public class UserService {

    public boolean addUser(String username, String nickname){
        System.out.println(username+","+nickname);
        return true;
    }
}
