package com.druid.demo.service;

import com.druid.demo.pojo.User;

public interface UserService {
    public User getOneUserByUsernamePassword(String username,String password);
    public User getOneUserByUsernamePassword2(String username,String password);
}
