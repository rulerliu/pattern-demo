package com.mayikt.handler.impl;

import com.mayikt.handler.GatewayHandler;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class BlacklistHandler extends GatewayHandler {

    public boolean service() {
        System.out.println("第二关 黑名单拦截.......");
        if (!new Random().nextBoolean()) {
            System.out.println("第二关 不通过");
            return false;
        }
        System.out.println("第二关 通过");
        return nextService();
    }
}
