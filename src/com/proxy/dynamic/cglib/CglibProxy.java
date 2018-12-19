package com.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by NJTZ on 2018/12/15.
 * CGLIB代理类
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    //获取一个对象,子类代理对象
    public Object getTarget(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();

    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前准备...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("买房后装修...");
        return result;
    }
}
