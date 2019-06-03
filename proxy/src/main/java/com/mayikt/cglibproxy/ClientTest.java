package com.mayikt.cglibproxy;

import com.mayikt.service.impl.OrderServiceImpl;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/31 0031 上午 11:05
 * @version: V1.0
 */
public class ClientTest {

    public static void main(String[] args) {
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        OrderServiceImpl proxy = cglibMethodInterceptor.getInstance(new OrderServiceImpl());
        proxy.order();
    }

}
