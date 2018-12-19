package com.proxy.dynamic.jdk;

/**
 * Created by NJTZ on 2018/12/15.
 * 真实买房
 */
public class RealBuyHouse implements BuyHouse {
    private String name;

    public RealBuyHouse(String name) {
        this.name = name;
    }

    @Override
    public void buyHouse() {
        System.out.println(name+",买房！");
    }
}
