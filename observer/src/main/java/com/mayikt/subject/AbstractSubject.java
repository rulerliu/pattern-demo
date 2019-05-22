package com.mayikt.subject;

import com.mayikt.observer.Observer;

public interface AbstractSubject {
    /**
     * 添加观察者  注册观察者
     */
    void addObServer(Observer observer);

    /**
     * 移除观察者
     */
    void removeServer(Observer observer);


    /**
     * 通知消息
     */
    void notifyObservers(String message);
}
