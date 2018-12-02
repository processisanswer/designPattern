package com.singleton.EagerSingleton;

/**
 * Created by NJTZ on 2018/12/2.
 * 饿汉式
 * 非Lazy初始化
 * 线程安全
 * 常用方式，无锁，效率高
 * 类加载时就初始化，浪费内存
 * 基于classloader机制避免了多线程的同步问题
 *
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton=new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
