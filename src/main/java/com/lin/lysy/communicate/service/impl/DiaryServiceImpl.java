package com.lin.lysy.communicate.service.impl;

import com.lin.lysy.User.entity.User;
import com.lin.lysy.communicate.entity.Diary;
import com.lin.lysy.communicate.mapper.DiaryMapper;
import com.lin.lysy.communicate.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

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
    public Diary findByDiaryId(String diaryId) throws IOException {
        return diaryMapper.findByDiaryId(diaryId);
    }

    @Override
    public int getNumber() {
        return diaryMapper.getNumber();
    }

    @Override
    public List<Diary> findAll() {
        return diaryMapper.findAll();
    }

    @Override
    public List<Diary> findAllBySelfId(String selfID) {
        return diaryMapper.findAllBySelfId(selfID);
    }

    @Override
    public int addGra_num(String diaryId, String selfID) throws IOException {
        Diary diary = findByDiaryId(diaryId);
        int i = diary.getGra_num()+1;
        return diaryMapper.addGra_num(i,diaryId, selfID);
    }
}
