package com.lin.lysy.communicate.controller;

import com.lin.lysy.User.entity.User;
import com.lin.lysy.User.service.UserService;
import com.lin.lysy.communicate.entity.Diary;
import com.lin.lysy.communicate.service.DiaryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/Diary")
public class DiaryController {
    @Autowired
    private DiaryService DiaryService;

    @RequestMapping("/addDiary")
    public String addDiary(Diary diary) throws IOException {
        int number = DiaryService.getNumber();
        diary.setDiaryId(number+1);
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        diary.setDate(dateFormat.format(date));
        DiaryService.addDiary(diary);
        return "添加成功";
    }
    @RequestMapping("/findByDiaryId")
    Diary findByDiaryId(String diaryId) throws IOException{
        return DiaryService.findByDiaryId(diaryId);
    };
    @RequestMapping("/findAll")
    List<Diary> findAll(){
        return DiaryService.findAll();
    }
    @RequestMapping("/findAllBySelfId")
    List<Diary> findAllBySelfId(String selfID){
        return DiaryService.findAllBySelfId(selfID);
    };
    @RequestMapping("/addGra_num")
    int addGra_num(String diaryId,String selfID) throws IOException {
        return DiaryService.addGra_num(diaryId, selfID+"#");
    };
}
