package com.mayikt.controller;

import com.alibaba.fastjson.JSONObject;
import com.mayikt.event.OrderMessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/sendMsg")
    public String sendMsg() {
        //1.定义发送消息内容
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "644064779@qq.com");
        jsonObject.put("phone", "15123456789");
        jsonObject.put("text", "恭喜您以1399.00元购买蚂蚁课堂永久会员.");
        OrderMessageEvent orderMessageEvent = new OrderMessageEvent(this, jsonObject);
        applicationContext.publishEvent(orderMessageEvent);
        return "success";
    }
}
