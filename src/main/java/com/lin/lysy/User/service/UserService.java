package com.lin.lysy.User.service;

import com.lin.lysy.User.entity.User;

import java.io.IOException;


public interface UserService {
    public void addUser(User user);
    public User SelectUserByUserIdPassword(String userId,String password) throws IOException;
    public User findBySelfID(String selfID) throws IOException;
}
