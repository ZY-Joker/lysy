package com.lin.lysy.index.service;

import com.lin.lysy.index.entity.User;
import org.springframework.stereotype.Component;


public interface Iindex {
    public String login(String userId, String password);
    public void regiest(User user);

}
