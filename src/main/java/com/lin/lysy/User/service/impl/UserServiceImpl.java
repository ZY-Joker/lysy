package com.lin.lysy.User.service.impl;

import com.lin.lysy.User.entity.User;
import com.lin.lysy.User.mapper.UserMapper;
import com.lin.lysy.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapper")
    UserMapper UserMapper;


    @Override
    @Transactional
    public void addUser(User user) {
      UserMapper.addUser(user.getUserName(),user.getUserId(),user.getType(),user.getPassword(),user.getSelfID(),user.getSex(),user.getAge(),user.getAddress(),user.getDate());
    }

    @Override
    public User SelectUserByUserIdPassword(String userId, String password) throws IOException {
        return UserMapper.selectUserByUserIdPassword(userId, password);
    }

    @Override
    public User findBySelfID(String selfID) throws IOException {
        return UserMapper.findBySelfID(selfID);
    }
}
