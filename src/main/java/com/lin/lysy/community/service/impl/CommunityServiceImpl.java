package com.lin.lysy.community.service.impl;

import com.lin.lysy.community.entity.Community;
import com.lin.lysy.community.mapper.CommunityMapper;
import com.lin.lysy.community.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    CommunityMapper communityMapper;

    @Override
    public List<Community> selectAllByaddress(String address) {
        System.out.println(address);
        return communityMapper.selectAllByaddress(address);
    }

    @Override
    public Community selectOneByCom_id(String Com_Id) {
        return communityMapper.selectOneByCom_id(Com_Id);
    }

    @Override
    public List<Community> seachCom(String Com_name) {
        return communityMapper.seachCom(Com_name);
    }

    @Override
    public String searchCom(String selfID) {
        return communityMapper.searchCom('%'+selfID+'%');
    }
}
