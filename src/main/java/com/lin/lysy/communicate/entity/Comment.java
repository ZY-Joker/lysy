package com.lin.lysy.communicate.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Comment{
    /**
     *  用户的id 账户
     * */
    private String selfID;
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

    public String getSelfID() {
        return selfID;
    }

    public void setSelfID(String selfID) {
        this.selfID = selfID;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCom_content() {
        return com_content;
    }

    public void setCom_content(String com_content) {
        this.com_content = com_content;
    }

    public Date getCom_data() {
        return com_data;
    }

    public void setCom_data(Date com_data) {
        this.com_data = com_data;
    }
}
