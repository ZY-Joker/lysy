package com.lin.lysy.communicate.mapper;

import com.lin.lysy.communicate.entity.Diary;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("DiaryMapper")
public interface DiaryMapper {
    /**
     *   发布帖子
     * */
    void addDiary(@Param("diary") Diary diary);
    /**
     * 查看日志
     */
    Diary findByDiaryId(@Param("diaryId") String diaryId) throws IOException;

    @Select("select count(*) from Diary")
    int getNumber();
    /**
     * 查看所有日志
     * */
    List<Diary> findAll();
    /**
     * 根据ID进行日志查找
     * */
    List<Diary> findAllBySelfId(@Param("selfID") String selfID);
    /**
     * 点赞
     * */
    @Update("update Diary set gra_num = #{i}, gra_id = #{selfID} where DiaryId = #{diaryId}")
    int addGra_num(int i, @Param("diaryId") String diaryId, @Param("selfID") String selfID);
}
