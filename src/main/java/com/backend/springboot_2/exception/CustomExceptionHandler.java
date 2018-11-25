package com.backend.springboot_2.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.FileNotFoundException;

/**
 * Title: 全局异常处理
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 15:45
 */
@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(FileNotFoundException.class)
    public String fileNotFindHandler(Exception e){
        return "catch exception : " + e.getClass().getName();
    }
}
