package com.lin.lysy.communicate.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("CommentMapper")
public interface CommentMapper {
    /**
     * 评价日志
     * */
    @Update("insert into Comment(userId,commentId,com_content,com_date) values(#{userId},#{diaryId},#{com_content},#{date})")
    void addCom_content(@Param("userId") String userId,@Param("diaryId") String diaryId,@Param("com_content") String com_content,@Param("date") String date);
}
