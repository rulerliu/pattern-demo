package com.mayikt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mayikt.mapper")
public class AppHandler {

    /**
     * 127.0.0.1:9092/client
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AppHandler.class);
    }
}
