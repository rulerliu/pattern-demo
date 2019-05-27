package com.mayikt.decorator;

import com.mayikt.component.GatewayComponent;

/**
 * @description: 抽象装饰者：持有对具体构件角色的引用并定义与抽象构件角色一致的接口
 * @author: liuwq
 * @date: 2019/5/27 0027 上午 10:19
 * @version: V1.0
 */
public abstract class AbstractDecorator extends GatewayComponent {
    private GatewayComponent gatewayComponent;

    public AbstractDecorator() {}

    public AbstractDecorator(GatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }

    @Override
    public void service() {
        gatewayComponent.service();
    }

    public void setGatewayComponent(GatewayComponent gatewayComponent) {
        if (gatewayComponent != null) {
            this.gatewayComponent = gatewayComponent;
        }
    }
}
