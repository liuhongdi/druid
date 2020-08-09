package com.druid.demo.service.impl;

import com.druid.demo.mapper.UserMapper;
import com.druid.demo.pojo.User;
import com.druid.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /*
    public User getOneUserByUserId(String userId) {
        User user_one = userMapper.selectOneUserByUserId(userId);
        return user_one;
    }
    */
    @Override
    public User getOneUserByUsernamePassword(String username,String password) {
        User userOne = userMapper.selectOneUserByUsernamePassword(username,password);
        System.out.println(userOne);
        return userOne;
    }

    @Override
    public User getOneUserByUsernamePassword2(String username,String password) {
        User userOne = userMapper.selectOneUserByUsernamePassword2(username,password);
        System.out.println(userOne);
        return userOne;
    }
}