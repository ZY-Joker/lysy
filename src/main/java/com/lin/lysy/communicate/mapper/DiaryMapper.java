package com.lin.lysy.communicate.mapper;

import com.lin.lysy.communicate.entity.Diary;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("DiaryMapper")
public interface DiaryMapper {
    /**
     *   发布帖子
     * */
    void addDiary(@Param("diary") Diary diary);
    Diary findByDiaryId(@Param("diaryId") int diaryId) throws IOException;
    @Select("select count(*) from Diary")
    int getNumber();
}
