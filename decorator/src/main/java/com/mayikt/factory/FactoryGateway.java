package com.mayikt.factory;

import com.mayikt.component.GatewayComponent;
import com.mayikt.component.impl.BasicGatewayComponent;
import com.mayikt.decorator.impl.LimitDecorator;
import com.mayikt.decorator.impl.LogDecorator;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/27 0027 上午 10:32
 * @version: V1.0
 */
public class FactoryGateway {

    public static GatewayComponent getGatewayComponent() {
        // 1.新增日志收集
        LogDecorator logDecorator = new LogDecorator();
        // 2.新增Api接口限流
        LimitDecorator limitDecorator = new LimitDecorator(logDecorator);
        // 3.创建基本网关获取参数功能
        logDecorator.setGatewayComponent(new BasicGatewayComponent());
        return limitDecorator;

        /*LogDecorator logDecorator = new LogDecorator();
        LimitDecorator limitDecorator = new LimitDecorator(logDecorator);
        logDecorator.setGatewayComponent(new BasicGatewayComponent());
        return limitDecorator;*/
    }

    public static void main(String[] args) {
        GatewayComponent gatewayComponent = FactoryGateway.getGatewayComponent();
        /**
         * 先执行父类的service()
         */
        gatewayComponent.service();
    }

}
