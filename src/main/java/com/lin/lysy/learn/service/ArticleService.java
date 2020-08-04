package com.lin.lysy.learn.service;

import com.lin.lysy.learn.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {

    Article findByArticleTitle(int articleId);

    List<Article> findAll();

    List<Article> queryByLike(String title);
}

