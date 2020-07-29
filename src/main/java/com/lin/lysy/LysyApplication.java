package com.lin.lysy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lin.lysy.*.mapper")
public class LysyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LysyApplication.class, args);
    }

}
