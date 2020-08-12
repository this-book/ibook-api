package com.ibook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.ibook.mapper")
@SpringBootApplication
public class IbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbookApplication.class, args);
    }

}
