package com.forezp.serviceredis.pojo;

import java.io.Serializable;

/**
  * @ClassName User
  * @Description TODO
  * @Author Cheham_Dean
  * @Date 2019/4/30 18:05
  * @Version 1.0.0
  **/
public class User implements Serializable {

    private Long id;

    private String userName;

    private String password;

    private String trueName;

    private String phone;

    public User(){}

    public User(Long id, String userName, String password, String trueName, String phone) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.trueName = trueName;
        this.phone = phone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getTrueName() {
        return trueName;
    }

    public String getPhone() {
        return phone;
    }
}
