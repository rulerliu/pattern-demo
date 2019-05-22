package com.mayikt.test;

import com.mayikt.observable.MessageObservable;
import com.mayikt.observable.observer.EmailObserver;
import com.mayikt.observable.observer.SmsObserver;
import com.mayikt.observable.observer.WechatObserver;

import java.util.Observable;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 2:22
 * @version: V1.0
 */
public class TestObservable {

    public static void main(String[] args) {
        Observable observable = new MessageObservable();
        EmailObserver emailObserver = new EmailObserver();
        SmsObserver smsObserver = new SmsObserver();
        WechatObserver wechatObserver = new WechatObserver();
        observable.addObserver(emailObserver);
        observable.addObserver(smsObserver);
        observable.addObserver(wechatObserver);
        observable.notifyObservers("aaaaaa");
        System.out.println(">>>");

        observable.deleteObserver(emailObserver);
        observable.notifyObservers("aaaaaa");
    }
    
}
