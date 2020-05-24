package com.lin.lysy.index.mapper;

import com.lin.lysy.index.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import javax.jws.soap.SOAPBinding;

/**
 * 用户登陆、注册
 * */
public interface index {
    @Select("select * from User where userId = ? && password = ?")
    User getUser(String userId,String password);


    @Insert("insert into User values(?,?,?,?,?)")
    void addUser(String userName, String userId, int type, String password, String selfID);
}



