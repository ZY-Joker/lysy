package com.lin.lysy.User.mapper;

import com.lin.lysy.User.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 用户登陆、注册
 * */
@Component("userMapper")
public interface UserMapper {
    @Select("select type from User where userId=#{userId} and password=#{password}")
    int selectUserByUserIdPassword(@Param("userId") String userId, @Param("password") String password);

    @Insert("insert into User(userName,userId,type,password,selfID,sex,age,address) values(#{userName},#{userId},#{type},#{password},#{selfID},#{sex},#{age},#{address})")
    void addUser(@Param("userName") String userName, @Param("userId") String userId, @Param("type") int type, @Param("password") String password, @Param("selfID") String selfID, @Param("sex") String sex, @Param("age") int age, @Param("address") String address);

    User findBySelfID(@Param("selfID") String selfID) throws IOException;
}



