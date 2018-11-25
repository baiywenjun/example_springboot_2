package com.backend.springboot_2.exception;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * Title: 自定义错误页面
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 15:24
 */
//@Configuration
public class CustomErrorPageRegistrar implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
        registry.addErrorPages(e404,e500);
    }

}
