package com.lin.lysy.learn.entity;

public class Article {
    private int articleId;
    private String image;
    private String title;
    private String content;
    private int l_category;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public int getL_category() {
        return l_category;
    }

    public void setL_category(int l_category) {
        this.l_category = l_category;
    }
}
