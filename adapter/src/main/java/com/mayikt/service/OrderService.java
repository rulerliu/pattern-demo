package com.mayikt.service;

import java.util.Map;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/4 0004 下午 4:41
 * @version: V1.0
 */
public class OrderService {

    public void forOrderMap(Map map) {
        for (int i = 0; i < map.size(); i++) {
            // 使用I作为MapKey获取数据
            String value = (String) map.get(i);
            System.out.println("value:" + value);
        }
    }

}
