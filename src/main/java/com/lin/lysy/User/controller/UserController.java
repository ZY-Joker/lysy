package com.lin.lysy.User.controller;
import com.lin.lysy.User.entity.User;
import com.lin.lysy.User.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value="/User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String Regiest(String userId, String userName, String password,String selfID, int type, String sex, int age, String address){
        User user = new User(userName,userId ,type, password,selfID, sex,age,address);
        userService.addUser(user);
        String msg = "注册成功";
        return msg;
    }

    @RequestMapping("/Login")
    public User Login(String userId, String password) throws IOException {
        return userService.SelectUserByUserIdPassword(userId, password);
    }


    @RequestMapping("/SelectByselfID")
    public User findBySelfID(String selfID) throws IOException {
        return userService.findBySelfID(selfID);
    }
}
