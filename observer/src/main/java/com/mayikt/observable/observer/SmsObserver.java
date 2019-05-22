package com.mayikt.observable.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 2:20
 * @version: V1.0
 */
public class SmsObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("用户下单成功,发送短信提醒内容:" + arg);
    }
}
