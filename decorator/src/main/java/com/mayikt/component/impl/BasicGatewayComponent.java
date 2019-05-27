package com.mayikt.component.impl;

import com.mayikt.component.GatewayComponent;

/**
 * @description: 具体组件：将要被附加功能的类，实现抽象构件角色接口
 * @author: liuwq
 * @date: 2019/5/27 0027 上午 10:17
 * @version: V1.0
 */
public class BasicGatewayComponent extends GatewayComponent {

    @Override
    public void service() {
        System.out.println(">>>网关开始获取基本参数信息");
    }
}
