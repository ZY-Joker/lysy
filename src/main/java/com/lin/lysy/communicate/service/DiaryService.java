package com.lin.lysy.communicate.service;

import com.lin.lysy.communicate.entity.Diary;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.io.IOException;
import java.util.List;

public interface  DiaryService {
    void addDiary( Diary diary) throws IOException;
    Diary findByDiaryId(String diaryId) throws IOException;
    int getNumber();
    List<Diary> findAll();

    List<Diary> findAllBySelfId( String selfID);

    int addGra_num( String diaryId, String selfID) throws IOException;
}
