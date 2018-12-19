package com.proxy.dynamic.cglib;

import com.proxy.dynamic.jdk.*;

/**
 * Created by NJTZ on 2018/12/15.
 * CGLIB创建的动态代理对象性能高，但是创建代理对象时所花费的时间更多。
 * 单例对象，多用CGLIB，另外由于是采用动态创建子类的方法
 * 对于final修饰的方法无法进行代理。
 *
 */
public class CglibMain {
    public static void main(String[] args) {
        BuyHouse buyHouse=new BuyHouse("zhenggm");
        CglibProxy cglibProxy=new CglibProxy();
        BuyHouse buyHouseCglibProxy=
                (BuyHouse) cglibProxy.getTarget(buyHouse);
        buyHouseCglibProxy.buyHouse("zhenggm");

    }
}
