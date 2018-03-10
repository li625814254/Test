package com.baidu.dao.impl.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.dao.UserDao;
import com.baidu.domain.User;

/**  
 * ClassName:UserDaoImplTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午9:08:25 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class UserDaoImplTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        User user = userDao.findByUser(1);
        assertEquals("zs", user.getUsername());
    }

}
  
