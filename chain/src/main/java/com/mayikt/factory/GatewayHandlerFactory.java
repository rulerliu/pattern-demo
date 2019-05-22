package com.mayikt.factory;

import com.mayikt.handler.GatewayHandler;
import com.mayikt.handler.impl.BlacklistHandler;
import com.mayikt.handler.impl.ConversationHandler;
import com.mayikt.handler.impl.CurrentLimitHandler;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 4:31
 * @version: V1.0
 */
public class GatewayHandlerFactory {

    public static GatewayHandler getGatewayHandler() {
        CurrentLimitHandler currentLimitHandler = new CurrentLimitHandler();
        BlacklistHandler blacklistHandler = new BlacklistHandler();
        ConversationHandler conversationHandler = new ConversationHandler();

        currentLimitHandler.setNextGatewayHandler(blacklistHandler);
        blacklistHandler.setNextGatewayHandler(conversationHandler);
        return currentLimitHandler;
    }

}
