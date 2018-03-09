package com.baidu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**  
 * ClassName:User <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:11:42 <br/>       
 */
//@Entity
//@Table(name="ssh_user")
public class User {
    //@Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    //@Column
    private String username;
    //@Column
    private String password;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
  
