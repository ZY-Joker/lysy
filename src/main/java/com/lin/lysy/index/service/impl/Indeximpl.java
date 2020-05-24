package com.lin.lysy.index.service.impl;

import com.lin.lysy.index.entity.User;
import com.lin.lysy.index.mapper.index;
import com.lin.lysy.index.service.Iindex;
import org.springframework.stereotype.Component;

@Component
public class Indeximpl implements Iindex {
    index index;
    @Override
    public String login(String userId, String password) {
        return null;
    }

    @Override
    public void regiest(User user) {
      index.addUser(user.getUserName(),user.getUserId(),user.getType(),user.getPassword(),user.getSelfID());
    }
}
