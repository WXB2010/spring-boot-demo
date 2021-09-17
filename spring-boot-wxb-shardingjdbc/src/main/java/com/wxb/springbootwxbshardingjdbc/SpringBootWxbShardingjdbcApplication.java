package com.wxb.springbootwxbshardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wxb.springbootwxbshardingjdbc.mapper")
public class SpringBootWxbShardingjdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWxbShardingjdbcApplication.class, args);
    }

}
