package com.lin.lysy.learn.service.impl;

import com.lin.lysy.learn.entity.Article;
import com.lin.lysy.learn.mapper.ArticleMapper;
import com.lin.lysy.learn.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;




import java.util.List;
@Service
@Transactional
public class ArticleServiceImpl  implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public Article findByArticleTitle(int articleId){
        return articleMapper.findByArticleTitle(articleId);
    }

    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }

    @Override
    public List<Article> queryByLike(String title) {
        return articleMapper.queryByLike(title);
    }
}
