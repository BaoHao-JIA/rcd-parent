package com.rcd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.rcd.mapper")
public class RcdWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcdWebApplication.class, args);
    }

}
