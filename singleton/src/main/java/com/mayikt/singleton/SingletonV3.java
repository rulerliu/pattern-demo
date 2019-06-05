package com.mayikt.singleton;

/**
 * 方式二：懒汉式 线程安全
 *
 * 优点：懒加载，能够解决线程安全问题，创建和获取实例时都上锁
 * 缺点：效率非常低，所以推荐使用双重检验锁
 */
public class SingletonV3 {

    private static SingletonV3 singletonV3;

    // 抛异常防止反射破解单例，保证只能被实例一次
    private SingletonV3() throws Exception {
        synchronized (SingletonV3.class) {
            if (singletonV3 != null) {
                throw new Exception("该对象已经初始化..");
            }
        }
    }

    public synchronized static SingletonV3 getInstance() {
        System.out.println(Thread.currentThread().getName() + ",获取锁啦...");
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 第一个获取锁的线程进来new，后面的获取锁的线程不会进去
        if (singletonV3 == null) {
            System.out.println(Thread.currentThread().getName() + ",获取锁啦....最快开始创建实例对象...");
            try {
                singletonV3 = new SingletonV3();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return singletonV3;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonV3 instance = SingletonV3.getInstance();
                System.out.println(Thread.currentThread().getName() + "," + instance);
            }).start();
        }
    }

}
