package com.mayikt.test;

import com.mayikt.observer.impl.UserObserver;
import com.mayikt.subject.impl.WechatSubject;

public class TestObserver {

    public static void main(String[] args) {
        WechatSubject wechatSubject = new WechatSubject();
        UserObserver userObserver1 = new UserObserver("张三");
        UserObserver userObserver2 = new UserObserver("李四");
        wechatSubject.addObServer(userObserver1);
        wechatSubject.addObServer(userObserver2);
        wechatSubject.notifyObservers("aaaaaa");

        System.out.println(">>>>");
        wechatSubject.removeServer(userObserver1);
        wechatSubject.notifyObservers("bbbbbbb");
    }

}
