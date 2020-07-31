package com.lin.lysy.communicate.service;

import com.lin.lysy.communicate.entity.Diary;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;

public interface  DiaryService {
    void addDiary( Diary diary) throws IOException;
    Diary findByDiaryId(int diaryId) throws IOException;
    int getNumber();
}
