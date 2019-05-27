package com.mayikt.decorator.impl;

import com.mayikt.component.GatewayComponent;
import com.mayikt.decorator.AbstractDecorator;

/**
 * @description: 具体装饰：实现抽象装饰者角色，负责对具体构件添加额外功能
 * @author: liuwq
 * @date: 2019/5/27 0027 上午 10:26
 * @version: V1.0
 */
public class LogDecorator extends AbstractDecorator {

    public LogDecorator() {}

    public LogDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    @Override
    public void service() {
        System.out.println(super.getClass().toString());
        // 调用装饰类service
        super.service();
        // 日志收集
        System.out.println("第一步>>>>日志的采集.....");
    }

}
