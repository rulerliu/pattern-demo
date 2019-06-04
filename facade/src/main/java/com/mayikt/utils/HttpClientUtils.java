package com.mayikt.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpClientUtils {

    public static String doPost(String url, String text) {
        log.info(">>>Url:{},text:{}", url, text);
        return "success";
    }
}
