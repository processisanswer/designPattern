package com.proxy.staticProxy;

/**
 * Created by NJTZ on 2018/12/15.
 */
public class StaticProxyMain {

    public static void main(String[] args) {
        String file="C://logo.png";
        //使用代理类来获取一个实际类
        ProxyImage proxyImage=new ProxyImage(file);
        //提供功能
        proxyImage.display();
        System.out.println("--------------");
        //继续提供功能
        proxyImage.display();
    }
}
