package com.singleton.lazySingleton.threadSafe;

/**
 * Created by NJTZ on 2018/12/2.
 */
public class LazySingletonThreadSafeMain {
    public static void main(String[] args) {
        new ThreadTest().start();
        System.out.println(Thread.currentThread().getName()+"running....");
        System.out.println("main--"+LazySingletonThreadSafe.getInstance());
        new ThreadTest().start();

        new ThreadTest().start();
    }

    private static class ThreadTest extends Thread{

        public void run(){
            System.out.println(Thread.currentThread().getName()+"running....");
            System.out.println(Thread.currentThread().getName()+LazySingletonThreadSafe.getInstance());
        }
    }
}
