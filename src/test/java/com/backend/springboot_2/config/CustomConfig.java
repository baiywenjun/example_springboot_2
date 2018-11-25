package com.backend.springboot_2.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Title: 测试配置
 * Description: @TestConfiguration 只在测试环境下有效
 * author: wenjun
 * date: 2018/11/25 23:23
 */
@TestConfiguration
public class CustomConfig {

    @Bean
    public Runnable createRunnable(){
        return () -> {};
    }
}
