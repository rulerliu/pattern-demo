package com.mayikt.singleton;

import java.io.*;

/**
 * @description: 使用序列化方式，破解单例模式
 * @author: liuwq
 * @date: 2019/6/5 0005 下午 4:57
 * @version: V1.0
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        SingletonV1 instance = SingletonV1.getInstance();
        FileOutputStream fos = new FileOutputStream("E:\\code\\Singleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("E:\\code\\Singleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonV1 singleton2 = (SingletonV1) ois.readObject();
        System.out.println(singleton2 == instance);
    }

    //返回序列化获取对象 ，保证为单例
//    public Object readResolve() {
//        return singletonV3;
//    }

}
