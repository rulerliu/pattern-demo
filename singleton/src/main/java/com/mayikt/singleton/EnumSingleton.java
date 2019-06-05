package com.mayikt.singleton;

/**
 * 方式五：枚举形式
 *
 * 枚举形式能够先天性，防止反射和序列化破解单例
 */
public enum EnumSingleton {
    INSTANCE;

    // 枚举能够绝对有效的防止实例化多次,和防止反射和序列化破解
    public void add() {
        System.out.println("add方法...");
    }
}