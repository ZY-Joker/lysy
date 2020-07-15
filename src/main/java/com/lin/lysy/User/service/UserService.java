package com.lin.lysy.User.service;

import com.lin.lysy.User.entity.User;


public interface UserService {
    public void addUser(User user);
    public int SelectUserByUserIdPassword(String userId,String password);
}
