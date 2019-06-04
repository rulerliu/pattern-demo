package com.mayikt.test;

import com.mayikt.adapter.ListAdapter;
import com.mayikt.service.OrderService;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/4 0004 下午 4:41
 * @version: V1.0
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        ListAdapter listAdapter = new ListAdapter(list);

        new OrderService().forOrderMap(listAdapter);

    }

}
