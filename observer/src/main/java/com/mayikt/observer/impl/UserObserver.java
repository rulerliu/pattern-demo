package com.mayikt.observer.impl;

import com.mayikt.observer.Observer;

public class UserObserver implements Observer {

    private String name;

    public UserObserver() {}

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ",收到微信服务通知的消息:" + message);
    }
}
