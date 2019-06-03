package com.mayikt.staticproxy;

import com.mayikt.service.OrderService;
import com.mayikt.service.impl.OrderServiceImpl;

public class ClientTest {
    public static void main(String[] args) {
        OrderService orderServiceProxy = new OrderServiceProxy(new OrderServiceImpl());
        orderServiceProxy.order();
    }
}