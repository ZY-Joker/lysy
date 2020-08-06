package com.lin.lysy.community.mapper;

import com.lin.lysy.community.entity.Community;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CommunityMapper {
    @Select("select count(*) from Community")
    int getNumber();
    public void addCommunity(@Param("community") Community community);
    public List<Community> selectAllByaddress(@Param("Com_address") String address);
    public Community selectOneByCom_id(@Param("Com_Id") String Com_Id);
    public List<Community> seachCom(@Param("name") String Com_name);
    public String searchCom(@Param("selfID") String selfID);
}
