package com.mayikt.test;

import com.mayikt.context.OrderStateContext;
import com.mayikt.service.impl.InTransitOrderState;
import com.mayikt.service.impl.ShippedAlreadyOrderState;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/4 0004 下午 4:25
 * @version: V1.0
 */
public class StateTest {

    public static void main(String[] args) {
        OrderStateContext orderStateContext = new OrderStateContext(new ShippedAlreadyOrderState());
        orderStateContext.switchStateOrder();

        orderStateContext = new OrderStateContext(new ShippedAlreadyOrderState());
        orderStateContext.switchStateOrder();

        orderStateContext = new OrderStateContext(new InTransitOrderState());
        orderStateContext.switchStateOrder();
    }

}
