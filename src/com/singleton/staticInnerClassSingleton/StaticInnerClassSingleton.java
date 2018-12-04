package com.singleton.staticInnerClassSingleton;

/**
 * Created by NJTZ on 2018/12/4.
 * 支持Lazy初始化
 * 线程安全
 * 双检锁一样的功效，实现更简单。对静态域使用延迟初始化，同样利用了classloader机制来保证初始化instance时
 * 只有一个线程。
 */
public class StaticInnerClassSingleton {
    //静态内部类，新建这个实例,私有
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE=new StaticInnerClassSingleton();
        private SingletonHolder(){
            System.out.println("内部...");
        }
    }
    //私有化构造函数
    private StaticInnerClassSingleton(){
        System.out.println("外部...");
    }
    //向外部提供这个实例
    public static final StaticInnerClassSingleton getInstance(){
        System.out.println("调用外部实例化方法...");
        return SingletonHolder.INSTANCE;
    }
}
