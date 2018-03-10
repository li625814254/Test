package com.baidu.service.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.domain.User;
import com.baidu.service.UserService;

/**  
 * ClassName:UserServiceImplTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午9:12:41 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext*.xml")
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void test() {
        User user = userService.findByUser(1);
        assertEquals("zs", user.getUsername());
    }

}
  
