package com.backend.springboot_2.service;

import com.backend.springboot_2.config.CustomConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Title: todoedit
 * Description: 需要加入其它的类或配置，需要在 classes中加入类
 * author: wenjun
 * date: 2018/11/25 23:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CustomConfig.class)
public class UserServiceTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void testNull(){
        Assert.assertNotNull(context.getBean(UserService.class));
        Assert.assertNotNull(context.getBean(Runnable.class));
    }



}
