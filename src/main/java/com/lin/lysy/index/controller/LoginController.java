package com.lin.lysy.index.controller;

import com.lin.lysy.index.service.Iindex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
@PropertySource("classpath:application.properties")
public class LoginController {
    /**
     *   @Autowired 注入
     *   @Qualifier("index") 主动注入注解 指定bean
     * */
    @Autowired
    private Iindex index;


}
