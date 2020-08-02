package com.lin.lysy.community.controller;

import com.lin.lysy.community.entity.Community;
import com.lin.lysy.community.service.CommunityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/Community")
public class CommunityController {
    @Autowired
    CommunityService communityService;
    @RequestMapping("/selectAllByaddress")
    public List<Community> selectAllByaddress(String Com_address){
       return  communityService.selectAllByaddress('%'+Com_address+"%");
    };
    @RequestMapping("/selectOneByCom_id")
    public Community selectOneByCom_id(String Com_Id) {
        return communityService.selectOneByCom_id(Com_Id);
    };
    @RequestMapping("/searchCom")
    public List<Community> searchCom(String Com_name) {
       return communityService.seachCom('%'+Com_name+"%");
    };
}
