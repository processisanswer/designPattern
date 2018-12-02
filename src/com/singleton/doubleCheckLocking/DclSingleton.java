package com.singleton.doubleCheckLocking;

/**
 * Created by NJTZ on 2018/12/2.
 * 双检锁/双重检验锁
 * 支持lazy初始化
 * 线程安全
 * 采用双锁机制，安全且在多线程情况下能保持高性能
 * getInstance()的性能对应用程序很关键的时候使用
 *
 * 进阶 volatile 关键字 及同步代码块
 */
public class DclSingleton {

    private static volatile DclSingleton dclSingleton;
    private DclSingleton(){}

    public static DclSingleton getInstance(){
        if(dclSingleton==null){
            synchronized (DclSingleton.class){
                dclSingleton=new DclSingleton();
            }
        }
        return dclSingleton;
    }
}
