package com.singleton.lazySingleton.threadUnsafe;

/**
 * Created by NJTZ on 2018/12/2.
 * lazy singleton
 * 支持Lazy 初始化
 * 线程不安全
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            System.out.println("LazySingletonThreadSafe initializing...");
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
