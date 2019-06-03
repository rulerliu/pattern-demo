package com.mayikt.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/31 0031 上午 11:17
 * @version: V1.0
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    /**
     * 目标代理对象
     */
    private Object target;

    public <T> T getInstance(T target) {
        this.target = target;
        // 操作字节码，生成虚拟子类
        Enhancer enhancer = new Enhancer();
        // 设置代理类的付类
        enhancer.setSuperclass(target.getClass());
        // 设置回调对象
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("<<<<<cglib代理：日志收集开始...>>>>>>>");
        Object reuslt = methodProxy.invokeSuper(obj, args);
        System.out.println("<<<<<cglib代理：日志收集结束...>>>>>>>");
        return reuslt;
    }
}
