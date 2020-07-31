package com.lin.lysy.communicate.mapper;

import org.springframework.stereotype.Component;

@Component("CommentMapper")
public interface CommentMapper {
    /**
     * 评价日志
     * */
    void addcom_content(String com_content);
}
