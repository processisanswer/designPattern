package com.singleton.lazySingleton.threadSafe;

/**
 * Created by NJTZ on 2018/12/2.
 * 支持lazy 初始化
 * 线程安全
 * 效率很低，99%的情况下不需要同步
 * 第一次调用才初始化，避免内存浪费
 * 必须加锁syncronized才能保证单例，但加锁会影响效率
 *
 * 进阶  syncronized 关键字
 * 多线程测试
 */
public class LazySingletonThreadSafe {
    private static LazySingletonThreadSafe lazySingleton;

    private LazySingletonThreadSafe() {
    }

    public static synchronized LazySingletonThreadSafe getInstance() {
        if (lazySingleton == null) {
            System.out.println("inializing...");
            lazySingleton = new LazySingletonThreadSafe();
        }

        return lazySingleton;
    }
}


