package com.mayikt.service.impl;

import com.mayikt.service.OrderService;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/27 0027 下午 3:19
 * @version: V1.0
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public String order() {
        System.out.println("用户下单操作..");
        return "success";
    }
}
