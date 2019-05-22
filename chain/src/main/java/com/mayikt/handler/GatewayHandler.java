package com.mayikt.handler;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 4:24
 * @version: V1.0
 */
public abstract class GatewayHandler {

    /**
     * 执行下一个handler
     */
    protected GatewayHandler nextGatewayHandler;

    /**
     * 实现的handler 处理方案 强制必须实现
     */
    public abstract boolean service();

    public void setNextGatewayHandler(GatewayHandler nextGatewayHandler) {
        this.nextGatewayHandler = nextGatewayHandler;
    }

    /**
     *
     */
    protected boolean  nextService() {
        if (nextGatewayHandler != null) {
            return nextGatewayHandler.service();// 指向下一关黑名单
        }
        return false;
    }

}
