package com.backend.springboot_2.dao;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 17:47
 */
@Repository
public class UserDao {


    public void add(String username, String nickname){
        System.out.println(username+","+nickname);
    }

}
