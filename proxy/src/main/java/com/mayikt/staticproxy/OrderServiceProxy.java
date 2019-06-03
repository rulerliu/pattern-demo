package com.mayikt.staticproxy;

import com.mayikt.service.OrderService;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/27 0027 下午 3:21
 * @version: V1.0
 */
public class OrderServiceProxy implements OrderService {

    /**
     * 代理对象
     */
    private OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public String order() {
        System.out.println("日志收集开始..");
        String order = orderService.order();
        System.out.println("日志收集结束..");
        return order;
    }
}
