package com.lin.lysy.User.entity;


import lombok.Data;

@Data
public class User {
    /**
     * 用户姓名，== 微信名
     * */
    private String userName;
    /**
     * 用户ID == 账户 判定身份   默认身份证后6位
     * */
    private String userId;
    /**
     * 密码 == 登录密码
     * */

    private String password;
    /**
     * 身份证号
     * */
    private String selfID;

    /**
     * 身份判定 == “0”： 老人 ； “1”： 义工； “2”：管理员；
     * */
    private int type;
    private String sex;
    private int age;
    private String address;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String userName, String userId, int type, String password, String selfID, String sex, int age, String address) {
        this.userName = userName;
        this.userId = userId;
        this.password = password;
        this.selfID = selfID;
        this.type = type;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getSelfID() {
        return selfID;
    }

    public void setSelfID(String selfID) {
        this.selfID = selfID;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
