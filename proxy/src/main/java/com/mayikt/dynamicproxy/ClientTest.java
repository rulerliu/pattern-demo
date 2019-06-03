package com.mayikt.dynamicproxy;

import com.mayikt.service.OrderService;
import com.mayikt.service.impl.OrderServiceImpl;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/31 0031 上午 11:05
 * @version: V1.0
 */
public class ClientTest {

    public static void main(String[] args) {
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());
        OrderService orderServiceProxy = jdkInvocationHandler.getProxy();
        orderServiceProxy.order();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
    }

}
