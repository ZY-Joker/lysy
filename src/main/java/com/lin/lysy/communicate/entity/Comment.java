package com.lin.lysy.communicate.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Comment{
    /**
     *  用户的id 账户
     * */
    private String userId;
    /**
     * 评论人的id账户
     * */
    private String commentId;
    /**
     * 评论内容
     * */
    private String com_content;
    /**
     * 评论日期
     * */
    private Date com_data;
}
