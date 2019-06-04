package com.mayikt.context;

import com.mayikt.service.OrderStateService;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/4 0004 下午 4:21
 * @version: V1.0
 */
public class OrderStateContext {

    private OrderStateService orderStateService;

    public OrderStateContext (OrderStateService orderStateService) {
        this.orderStateService = orderStateService;
    }

    public void switchStateOrder() {
        orderStateService.orderService();
    }

}
