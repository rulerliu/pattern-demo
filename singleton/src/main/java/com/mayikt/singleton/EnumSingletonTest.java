package com.mayikt.singleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {
    public static void main(String[] args) throws Exception {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance2);

        // 反射不能new对象
        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        EnumSingleton v3 = declaredConstructor.newInstance();
        System.out.println(v3 == instance1);
    }
}