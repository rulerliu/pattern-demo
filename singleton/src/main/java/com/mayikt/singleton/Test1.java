package com.mayikt.singleton;

import java.lang.reflect.Constructor;

/**
 * @description: 使用反射方式，破解单例模式
 * @author: liuwq
 * @date: 2019/6/5 0005 下午 4:57
 * @version: V1.0
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
        // 1. 使用懒汉式创建对象
        SingletonV3 instance1 = SingletonV3.getInstance();
        System.out.println(instance1);


        // 2. 使用Java反射技术初始化对象 执行无参构造函数
        Constructor<SingletonV3> declaredConstructor = SingletonV3.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        SingletonV3 instance2 = declaredConstructor.newInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }

}
