package com.observer;

/**
 * Created by NJTZ on 2018/12/19.
 */
public class ObserverMain {
    public static void main(String[] args) {
        User zhangsan=new User("zhangsan");
        User lisi=new User("lisi");
        User wangwu=new User("wanngwu");

        WechatServer wechatServer=new WechatServer();
        wechatServer.registerObserver(zhangsan);
        wechatServer.registerObserver(lisi);
        wechatServer.registerObserver(wangwu);

        wechatServer.setMessage("震惊！小编居然在...");
        System.out.println("---------------------");
        //张三取消了关注,测试
        wechatServer.removeObserver(zhangsan);
        wechatServer.setMessage("Sorry,...");


    }
}
