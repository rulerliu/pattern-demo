package com.mayikt.handler.impl;

import com.mayikt.handler.GatewayHandler;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CurrentLimitHandler extends GatewayHandler {

    public boolean service() {
        System.out.println("第一关 API接口限流操作.....");
        if (!new Random().nextBoolean()) {
            System.out.println("第一关 不通过");
            return false;
        }
        System.out.println("第一关 通过");
        return nextService();// 指向下一关黑名单
    }
}
