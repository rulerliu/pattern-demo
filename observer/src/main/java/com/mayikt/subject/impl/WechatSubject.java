package com.mayikt.subject.impl;

import com.mayikt.observer.Observer;
import com.mayikt.subject.AbstractSubject;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class WechatSubject implements AbstractSubject {

    private List<Observer> list;

    public WechatSubject() {
        list = new ArrayList<>();
    }

    @Override
    public void addObServer(Observer observer) {
        // 添加观察者
        if (observer == null) {
            throw new NullPointerException();
        }
        if (!list.contains(observer)) {
            list.add(observer);
        }
    }

    @Override
    public void removeServer(Observer observer) {
        // 移除观察者
        list.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        System.out.println("开始设置微信群发消息：" + message);

        if (!CollectionUtils.isEmpty(list)) {
            for(Observer observer : list) {
                // 调用该方法通知 获取具体的消息  群发
                observer.update(message);
            }
        }
    }
}
