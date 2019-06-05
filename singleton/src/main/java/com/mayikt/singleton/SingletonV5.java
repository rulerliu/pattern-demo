package com.mayikt.singleton;

/**
 * 方式四：静态内部内形式
 *
 * 静态内部方式能够避免同步带来的效率问题和有能实现延迟加载
 */
public class SingletonV5 {

    private SingletonV5() {
    }

    public static SingletonV5 getInstance() {
        return SingletonV5Utils.singletonV5;
    }

    static class SingletonV5Utils {
        private static SingletonV5 singletonV5 = new SingletonV5();

        private SingletonV5Utils() {}
    }

    public static void main(String[] args) {
//        SingletonV5 instance1 = SingletonV5.getInstance();
//        SingletonV5 instance2 = SingletonV5.getInstance();
//        System.out.println(instance1 == instance2);

        System.out.println(">>>Start...");
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonV5 instance = SingletonV5.getInstance();
                System.out.println(Thread.currentThread().getName() + "," + instance);
            }).start();
        }
        System.out.println(">>>End...");

    }
}
