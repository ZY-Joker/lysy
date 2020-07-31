package com.lin.lysy.communicate.controller;

import com.lin.lysy.User.entity.User;
import com.lin.lysy.User.service.UserService;
import com.lin.lysy.communicate.entity.Diary;
import com.lin.lysy.communicate.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
}
