package com.lin.lysy.learn.mapper;

import com.lin.lysy.learn.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public interface ArticleMapper {


        /**
         * 查看搜索到的文章
         */
        @Select("select * from Article where articleId=#{articleId}")
        Article findByArticleTitle(@Param("articleId")int articleId) ;



        /**
         * 浏览文章
         * */
        @Select("select * from Article")
        List<Article> findAll();

        /**
         * 关键字模糊查找
         * */
        @Select("select * from Article where '%'+title+'%'=#{title}")
        List<Article> queryByLike(@Param("title") String title);

    }



