package com.baidu.web;

import com.baidu.domain.User;
import com.baidu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:56:07 <br/>       
 */
//@Controller
//@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User model = new User();
    @Override
    public User getModel() {
          
        return model;
    }
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public String findByUser(){
        model = userService.findByUser(model.getId());
        return SUCCESS;
    }
}
  
