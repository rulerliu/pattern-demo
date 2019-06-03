package com.mayikt.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/27 0027 下午 3:39
 * @version: V1.0
 */
public class JdkInvocationHandler implements InvocationHandler {

    /**
     * 目标代理对象
     */
    public Object target;

    public JdkInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * JDK动态代理的一般步骤如下：
     * 1.创建被代理的接口和类；
     * 2.实现InvocationHandler接口，对目标接口中声明的所有方法进行统一处理；
     * 3.调用Proxy的静态方法，创建代理类并生成相应的代理对象；
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>jdk动态代理：日志收集开始>>>>");
        // 执行代理对象方法
        Object reuslt = method.invoke(target, args);
        System.out.println(">>>jdk动态代理：日志收集结束>>>>");
        return reuslt;
    }

    /**
     * 获取代理对象接口
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
