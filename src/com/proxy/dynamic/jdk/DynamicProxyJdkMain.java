package com.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * Created by NJTZ on 2018/12/15.
 * Proxy.newProxyInstance()方法接收三个参数
 * ClassLoader loader:指定当前目标对象使用的类加载器，获取加载器的方法是固定的
 * Class<?> interface：指定目标对象实现的接口的类型，使用泛型方式确认类型
 * InvocationHandler:指定动态处理器，执行目标方法时，会触发事件处理器的方法
 *
 * 动态代理：
 * 相对于静态代理，动态代理大大减少了我们的开发任务，同时减少了
 * 对业务接口的依赖，降低了耦合度。但是它始终无法摆脱仅支持interface
 * 代理的桎梏，因为它的设计注定了这个遗憾。
 *
 */
public class DynamicProxyJdkMain {
    public static void main(String[] args) {

        BuyHouse buyHouse = new RealBuyHouse("zhenggm");
        DynamicProxyHandler handler = new DynamicProxyHandler(buyHouse);
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, handler);
        proxyBuyHouse.buyHouse();
    }
}
