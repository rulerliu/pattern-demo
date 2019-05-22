package com.mayikt.observable;

import java.util.Observable;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 2:14
 * @version: V1.0
 */
public class MessageObservable extends Observable {

    @Override
    public void notifyObservers(Object arg) {
        // 1.修改状态为可以群发
        super.setChanged();
        // 2.调用父类的notifyObservers 群发消息
        super.notifyObservers(arg);
    }
}
