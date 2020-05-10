package com.lin.lysy.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Testcontroller {
    @GetMapping("/test")
    public String test(){
        return "成功接收";
    }
}
