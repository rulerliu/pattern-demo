package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppTemplate {

    /**
     *
     *  127.0.0.1:9093/asyncCallBack?templateId=aliPayCallbackTemplate
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AppTemplate.class);
    }
}
