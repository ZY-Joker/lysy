package com.lin.lysy.community.service;

import com.lin.lysy.community.entity.Community;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommunityService {
    int getNumber();
    int addCommunity(Community community);
    public List<Community> selectAllByaddress( String address);
    public Community selectOneByCom_id( String Com_Id);
    public List<Community> seachCom( String Com_name);
    public String searchCom( String selfID);
}
