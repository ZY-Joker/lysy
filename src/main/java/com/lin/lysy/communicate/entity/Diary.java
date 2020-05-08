package com.lin.lysy.communicate.entity;

public class Diary {
    /**
     * 用户id
     * */
    private String userId;
    /**
     * 发布标题
     * */
    private String title;
    /**
     * 发布内容
     * */
    private String content;
    /**
     * 发布照片
     * */
    private String image;
    /**
     * 发布日期
     * */
    private String date;
    /**
     * 所有评论人的id
     * */
    private String com_id;
    /**
     * 所有点赞人的id
     * */
    private String gra_id;
    /**
     * 评论人的数量
     * */
    private int com_num;
    /**
     * 点赞人的数量
     * */
    private int gra_num;
}
