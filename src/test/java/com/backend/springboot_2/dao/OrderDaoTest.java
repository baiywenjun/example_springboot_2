package com.backend.springboot_2.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 23:42
 */
@RunWith(SpringRunner.class)
public class OrderDaoTest {

    @MockBean
    private OrderDao orderDao;

    @Before
    public void init(){
        BDDMockito.given(orderDao.insertOrder("ABC")).willReturn(1);
        BDDMockito.given(orderDao.insertOrder("")).willReturn(0);
        BDDMockito.given(orderDao.insertOrder(null)).willThrow(NullPointerException.class);
    }

    @Test
    public void insertOrder() {
        Assert.assertEquals(Integer.valueOf(1),orderDao.insertOrder("ABC"));
        Assert.assertEquals(Integer.valueOf(0),orderDao.insertOrder(""));
        Assert.assertEquals(Integer.valueOf(0),orderDao.insertOrder("QWE"));
    }

    @Test(expected = NullPointerException.class)
    public void insertOrder2(){
        Assert.assertEquals(Integer.valueOf(0),orderDao.insertOrder(null));
    }
}