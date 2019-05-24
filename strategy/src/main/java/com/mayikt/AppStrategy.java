package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStrategy {

    /**
     * 127.0.0.1:9091/toPayHtml?payCode=aliPay
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AppStrategy.class);
    }
}
