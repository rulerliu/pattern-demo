package com.mayikt.service;

import com.mayikt.utils.HttpClientUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MsgService {

    public void sendMsg() {
        // 3.调用积分接口增加积分
        HttpClientUtils.doPost("jifen.com", "积分接口");
        log.info(">>第四个模块:调用消息服务平台模块..");
    }
}
