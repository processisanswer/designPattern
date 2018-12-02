package com.singleton.commonDemo;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by NJTZ on 2018/12/2.
 */
public class SingletonMain0 {
    public static void main(String[] args) {
        //构造方法私有，编译不通过
        //SingleObject singleObject=new SingleObject();
        System.out.println(SingleObject.getInstance());
        System.out.println(SingleObject.getInstance());
        SingleObject.getInstance().sayHello("Hao zi");
    }
}
