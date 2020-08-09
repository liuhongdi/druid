package com.druid.demo.controller;

import com.druid.demo.pojo.User;
import com.druid.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @GetMapping("/login")
    public Object login(@RequestParam("username") String username,
                               @RequestParam("password") String password
                               ) {
        User userOne = userService.getOneUserByUsernamePassword(username,password);
        if (userOne == null) {
            System.out.println("user is null");
        }
        return userOne;
    }

    @GetMapping("/login2")
    public Object login2(@RequestParam("username") String username,
                        @RequestParam("password") String password
    ) {
        User userOne = userService.getOneUserByUsernamePassword2(username,password);
        if (userOne == null) {
            System.out.println("user is null");
        }
        return userOne;
    }

}
