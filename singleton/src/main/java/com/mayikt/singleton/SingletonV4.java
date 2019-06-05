package com.mayikt.singleton;

/**
 * 方式三：.双重检验锁(DCL)
 */
public class SingletonV4 {
    /**
     * volatile 禁止重排序和 提高可见性
     */
    private volatile static SingletonV4 singletonV4;

    private SingletonV4() {

    }

    public static SingletonV4 getInstance() {
        // 第一次判断如果没有创建对象 开始上锁...
        if (singletonV4 == null) {
            synchronized (SingletonV4.class) {
                System.out.println(Thread.currentThread().getName() + ",获取锁啦...");
                // 当抢到锁，判断初始化
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // 第一个拿到锁的线程进来new，后面的拿到锁的线程都进不去
                if (singletonV4 == null) {
                    System.out.println(Thread.currentThread().getName() + ",获取锁啦....最快开始创建实例对象...");
                    singletonV4 = new SingletonV4();
                }
            }
        }
        return singletonV4;
    }

    public static void main(String[] args) {
        System.out.println(">>>Start...");
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonV4 instance = SingletonV4.getInstance();
                System.out.println(Thread.currentThread().getName() + "," + instance);
            }).start();
        }
        System.out.println(">>>End...");
    }
}
