package com.mayikt.singleton;

import java.io.Serializable;

/**
 * 方式一：.饿汉式
 * 优点：先天性线程是安全的，当类初始化的 就会创建该对象
 * 缺点：如果饿汉式使用过多，可能会影响项目启动的效率问题。
 */
public class SingletonV1 implements Serializable {

    private static SingletonV1 singletonV1 = new SingletonV1();

    /**
     * 将构造函数私有化 禁止初始化
     */
    private SingletonV1() {

    }

    public static SingletonV1 getInstance() {
        return singletonV1;
    }

    public static void main(String[] args) {
//        SingletonV1 instance1 = SingletonV1.getInstance();
//        SingletonV1 instance2 = SingletonV1.getInstance();
//        System.out.println(instance1 == instance2);

        // 模拟线程不安全
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonV1 instance = SingletonV1.getInstance();
                System.out.println(Thread.currentThread().getName() + "," + instance);
            }).start();
        }
    }

}