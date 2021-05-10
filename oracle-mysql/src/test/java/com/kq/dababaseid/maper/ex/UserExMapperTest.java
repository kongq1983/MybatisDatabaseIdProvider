package com.kq.dababaseid.maper.ex;

import com.kq.dababaseid.ApplicationBaseTest;
import com.kq.dababaseid.mapper.ex.UserExMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kq
 * @date 2021-05-10 11:07
 * @since 2020-0630
 */
public class UserExMapperTest extends ApplicationBaseTest {

    @Autowired
    private UserExMapper userExMapper;

    String userId = "9C3C7E6ECFFE17BAE055000000000001";

    @Test
    public void testGetName(){

       String account = userExMapper.getAccount(userId);
       Assert.assertNotNull(account);

        Assert.assertTrue("sa".equals(account));

    }

    @Test
    public void testGetNameByDatabase(){

       String account = userExMapper.getAccountByDataBase(userId);
       Assert.assertNotNull(account);

        Assert.assertTrue(account.endsWith("sa"));

    }


}
