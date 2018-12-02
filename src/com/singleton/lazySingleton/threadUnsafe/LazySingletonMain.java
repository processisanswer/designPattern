package com.singleton.lazySingleton.threadUnsafe;

/**
 * Created by NJTZ on 2018/12/2.
 */
public class LazySingletonMain {
    public static void main(String[] args) {
        System.out.println("第一次获取LzaySingleton");
        System.out.println(LazySingleton.getInstance());
        System.out.println("第二次获取LzaySingleton");
        System.out.println(LazySingleton.getInstance());
    }
}
