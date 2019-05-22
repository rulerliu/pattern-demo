package com.mayikt.handler.impl;

import com.mayikt.handler.GatewayHandler;
import org.springframework.stereotype.Component;

@Component
public class ConversationHandler extends GatewayHandler {

    public boolean service() {
        System.out.println("第三关 用户的会话信息拦截.......");
        return true;
//        nextService();
    }
}
