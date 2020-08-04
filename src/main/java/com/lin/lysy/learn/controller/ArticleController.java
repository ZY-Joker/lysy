package com.lin.lysy.learn.controller;


import com.lin.lysy.learn.entity.Article;
import com.lin.lysy.learn.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/Article")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @RequestMapping("/findByArticleTitle")
    public Article findByArticleTitle(int articleId){ return articleService.findByArticleTitle(articleId); };
    @RequestMapping("/findAll")
    public List<Article> findAll(){
        return articleService.findAll();
    }
    @RequestMapping("/queryByLike")
    public  List<Article> queryByLike(String title) { return articleService.queryByLike(title); };
}
