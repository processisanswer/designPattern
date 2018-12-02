package com.singleton.commonDemo;

/**
 * Created by NJTZ on 2018/12/2.
 * 单例模式通常步骤
 */
public class SingleObject {
    //创建静态成员对象
    private static SingleObject singleObject=new SingleObject();
    //私有化构造方法
    private SingleObject(){}
    //提供外界访问的通用方法
    public static SingleObject getInstance(){
        return singleObject;
    }

    public void sayHello(String name){
        System.out.println("Hello，"+name);
    }


}
