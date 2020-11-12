package com.texinc.loytesting.hrsystemplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.texinc.loytesting.hrsystemplus.mapper")
@EnableCaching
public class HrsystemplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrsystemplusApplication.class, args);
    }

}
