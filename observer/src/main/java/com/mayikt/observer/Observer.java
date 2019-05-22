package com.mayikt.observer;

public interface Observer {


    /**
     * 通知观察者消息
     *
     * @param message
     */
    void update(String message);

}
