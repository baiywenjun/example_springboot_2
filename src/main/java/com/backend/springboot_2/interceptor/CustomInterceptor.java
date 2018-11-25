package com.backend.springboot_2.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 14:52
 */
@Slf4j
public class CustomInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        log.info("========preHandle==========");
        return true;
    }

}
