package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSpringBoot {

    /**
     * 127.0.0.1:9091/toPayHtml?payCode=aliPay
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AppSpringBoot.class);
    }
}
