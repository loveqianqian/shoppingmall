package com.zhiboer.mall;

import com.zhiboer.mall.dao.ChuUserRepository;
import com.zhiboer.mall.model.ChuUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by yao on 2017/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/spring-mvc.xml")
public class ChuUserTests {

    @Autowired
    private ChuUserRepository chuUserRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    @Rollback(value = false)
    public void testSave() throws Exception {

        ChuUser chuUser = new ChuUser();

        chuUser.setId("1111aaabbb");
        chuUser.setUserName("aaaa");
        chuUser.setRealName("bbbb");
        chuUser.setCreateTime(new Date());
        chuUser.setAge(123);
        chuUser.setState("1");

        chuUserRepository.insertOne(chuUser);
//        chuUserRepository.saveAndFlush(chuUser);
    }
}
