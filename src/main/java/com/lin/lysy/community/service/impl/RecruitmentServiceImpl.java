package com.lin.lysy.community.service.impl;

import com.lin.lysy.community.entity.Recruitment;
import com.lin.lysy.community.mapper.RecruitmentMapper;
import com.lin.lysy.community.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RecruitmentServiceImpl implements RecruitmentService {
    @Autowired
    RecruitmentMapper recruitmentMapper;

    @Override
    public void addRecruitment(Recruitment recruitment) {
        recruitmentMapper.addRecruitment(recruitment);
    }

    @Override
    public int getNumber(String Com_Id) {
        return recruitmentMapper.getNumber(Com_Id);
    }

    @Override
    public Recruitment findOne(String Recru_Id) {
        return recruitmentMapper.findOne(Recru_Id);
    }

    @Override
    public int RecruSumit(String Recru_Id) {
        Recruitment recruitment = findOne(Recru_Id);
        int number = recruitment.getRecru_number();
        if(number == 1) {
            recruitmentMapper.Delete(Recru_Id);
        } else {
            number--;
            recruitmentMapper.RecruSumit(Recru_Id,number);
        }
        return 1;
    }
}
