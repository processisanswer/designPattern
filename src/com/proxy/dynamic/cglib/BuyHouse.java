package com.proxy.dynamic.cglib;

/**
 * Created by NJTZ on 2018/12/15.
 */
public class BuyHouse {
    private String name;

    public BuyHouse(){}
    public BuyHouse(String name) {
        this.name = name;
    }
    public void buyHouse(String name){
        System.out.println(name+",买房！");
    }
}
