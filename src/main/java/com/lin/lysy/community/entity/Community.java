package com.lin.lysy.community.entity;

import lombok.Data;

@Data
public class Community {
    private String Com_name;
    private int Com_Id;
    private String Com_address;
    private String Com_introduce;
    private String Com_image;
    private String Com_People;
    private String Com_phone;
    private String selfID;

    public Community(String com_name, int com_Id, String com_address, String com_introduce, String com_image, String com_People, String com_phone, String selfID) {
        Com_name = com_name;
        Com_Id = com_Id;
        Com_address = com_address;
        Com_introduce = com_introduce;
        Com_image = com_image;
        Com_People = com_People;
        Com_phone = com_phone;
        this.selfID = selfID;
    }
}
