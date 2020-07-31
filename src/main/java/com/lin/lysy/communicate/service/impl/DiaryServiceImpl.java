package com.lin.lysy.communicate.service.impl;

import com.lin.lysy.User.entity.User;
import com.lin.lysy.communicate.entity.Diary;
import com.lin.lysy.communicate.mapper.DiaryMapper;
import com.lin.lysy.communicate.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
@Service
@Transactional
public class DiaryServiceImpl implements DiaryService {
    @Autowired
    DiaryMapper diaryMapper;
    @Override
    public void addDiary(Diary diary) throws IOException {
        diaryMapper.addDiary(diary);
    }

    @Override
    public Diary findByDiaryId(int diaryId) throws IOException {
        return diaryMapper.findByDiaryId(diaryId);
    }

    @Override
    public int getNumber() {
        return diaryMapper.getNumber();
    }
}
