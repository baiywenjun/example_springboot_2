package com.backend.springboot_2.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/26 0:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void home() {
        String result = template.getForObject("/book/home", String.class);
        Assert.assertEquals("book_home",result);
    }
}