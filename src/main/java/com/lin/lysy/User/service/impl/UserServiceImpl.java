package com.lin.lysy.User.service.impl;

import com.lin.lysy.User.entity.User;
import com.lin.lysy.User.mapper.UserMapper;
import com.lin.lysy.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper UserMapper;
    @Override
    public void addUser(User user) {
      UserMapper.addUser(user.getUserName(),user.getUserId(),user.getType(),user.getPassword(),user.getSelfID(),user.getSex(),user.getAge(),user.getAddress());
    }

    @Override
    public int SelectUserByUserIdPassword(String userId, String password) {
        return UserMapper.selectUserByUserIdPassword(userId,password);
    }
}
