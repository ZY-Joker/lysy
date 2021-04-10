package com.lin.lysy.community.service;

import com.lin.lysy.community.entity.Recruitment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitmentService {
    public void addRecruitment( Recruitment recruitment);
    public int getNumber(String Com_Id);
    public Recruitment findOne(String Recru_Id);
    public int RecruSumit(String Recru_Id);
     public List<Recruitment> queryByComId(String Com_Id);
}
