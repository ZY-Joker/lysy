package com.lin.lysy.index.controller;
import com.lin.lysy.index.entity.User;
import com.lin.lysy.index.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:application.properties")
public class RegiestController {
    @Autowired
    private Iindex userService;
    @RequestMapping("/regiest")
    public String Regiest(String userId, String userName, String password, int type){
        User user = new User(userId, userName, password, type);
        userService.login(user);
        return "注册成功";
    }
}
