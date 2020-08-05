package com.lin.lysy.community.controller;

import com.lin.lysy.community.entity.Recruitment;
import com.lin.lysy.community.service.CommunityService;
import com.lin.lysy.community.service.RecruitmentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value="/Community/Recruitment")
public class RecruitmentController {
    @Autowired
    RecruitmentService recruitmentService;
    @Autowired
    CommunityService communityService;
    @RequestMapping(value="/addRecruitment")
    public String addRecruitment(String selfID, String Recru_content,int Recru_number,String Recru_title, String Recru_time){
            String Com_Id =  communityService.searchCom(selfID);
            Recruitment recruitment = new Recruitment();
            recruitment.setCom_Id(Com_Id);
            recruitment.setRecru_content(Recru_content);
            recruitment.setRecru_number(Recru_number);
            recruitment.setRecru_title(Recru_title);
            recruitment.setRecru_time(Recru_time);
            Date date = new Date();
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
            recruitment.setRecru_date(dateFormat.format(date));
            int i = recruitmentService.getNumber(Com_Id);
            recruitment.setRecru_Id(Com_Id+""+(i+1));
            recruitmentService.addRecruitment(recruitment);
return "发布招聘成功";
    };
    @RequestMapping(value="/RecruByRecru_Id")
    public Recruitment findOne(String Recru_Id){
        return recruitmentService.findOne(Recru_Id);
    };
    @RequestMapping(value="/RecruSumit")
    public String RecruSumit(String Recru_Id){
        int i = recruitmentService.RecruSumit(Recru_Id);
        if(i == 1) {
            return "招聘成功";
        } else {
            return "招聘失败";
        }

    }
}
