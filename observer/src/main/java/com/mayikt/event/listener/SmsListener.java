package com.mayikt.event.listener;

import com.mayikt.event.OrderMessageEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 2:37
 * @version: V1.0
 */
@Component
public class SmsListener implements ApplicationListener<OrderMessageEvent> {

    @Override
    @Async
    public void onApplicationEvent(OrderMessageEvent orderMessageEvent) {
        // 如何获取到当前容器下面所有的观察者呢？反射机制获取ApplicationListener 接口下面子类
        System.out.println(Thread.currentThread().getName() + "开始发送短信消息内容:" + orderMessageEvent.getJsonObject().toJSONString());
    }
}
