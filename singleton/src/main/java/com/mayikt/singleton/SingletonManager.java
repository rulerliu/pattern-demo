package com.mayikt.singleton;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

public class SingletonManager {

    private static Map<String, Object> beanMap = new HashMap<String, Object>();

    public static void setBean(String key, Object instance) {
        if (!beanMap.containsKey(key)) {
            beanMap.put(key, instance);
        }
    }
    public static Object getBean(String key) {
        Assert.notNull(key, "key must not be null!");
        return beanMap.get(key);
    }

    public static void main(String[] args) {
        SingletonManager.setBean("aa", new Object());

        System.out.println(">>>Start...");
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Object instance = SingletonManager.getBean("aa");
                System.out.println(Thread.currentThread().getName() + "," + instance);
            }).start();
        }
        System.out.println(">>>End...");
    }

}
