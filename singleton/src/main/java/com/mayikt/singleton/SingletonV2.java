package com.mayikt.singleton;

/**
 * 方式二：.懒汉式 （线程不安全）
 *
 * 优点：在真正需要创建对象的时候使用...懒加载
 * 缺点：多线程情况下，创建多个对象，不能实现单例
 */
public class SingletonV2 {

    private static SingletonV2 singletonV2;

    private SingletonV2() {

    }

    public static SingletonV2 getInstance() {
        if (singletonV2 == null) {
            // 多个线程同时到这里sleep，之后都会new对象
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }

            singletonV2 = new SingletonV2();
        }
        return singletonV2;
    }

    public static void main(String[] args) {
//        SingletonV2 instance1 = SingletonV2.getInstance();
//        SingletonV2 instance2 = SingletonV2.getInstance();
//        System.out.println(instance1 == instance2);

        // 模拟线程不安全
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonV2 instance = SingletonV2.getInstance();
                System.out.println(Thread.currentThread().getName() + "," + instance);
            }).start();
        }
    }
}
