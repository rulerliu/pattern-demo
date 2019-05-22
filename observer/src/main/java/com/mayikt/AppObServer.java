package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AppObServer {
    /**
     * 127.0.0.1:9090/sendMsg
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AppObServer.class);
    }
}
