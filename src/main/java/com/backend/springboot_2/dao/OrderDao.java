package com.backend.springboot_2.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 23:40
 */
public interface OrderDao {

    Integer insertOrder(String orderNo);
}
