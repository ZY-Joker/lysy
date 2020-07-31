package com.lin.lysy.communicate.entity;

import lombok.Data;

@Data
public class Diary {
    /**
     * 用户id
     * */
    private String selfID;
    private int DiaryId;
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

    public String getSelfID() {
        return selfID;
    }

    public void setSelfID(String selfID) {
        this.selfID = selfID;
    }

    public int getDiaryId() {
        return DiaryId;
    }

    public void setDiaryId(int diaryId) {
        DiaryId = diaryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCom_id() {
        return com_id;
    }

    public void setCom_id(String com_id) {
        this.com_id = com_id;
    }

    public String getGra_id() {
        return gra_id;
    }

    public void setGra_id(String gra_id) {
        this.gra_id = gra_id;
    }

    public int getCom_num() {
        return com_num;
    }

    public void setCom_num(int com_num) {
        this.com_num = com_num;
    }

    public int getGra_num() {
        return gra_num;
    }

    public void setGra_num(int gra_num) {
        this.gra_num = gra_num;
    }
}
