package com.proxy.staticProxy;

/**
 * Created by NJTZ on 2018/12/15.
 * 代理类，同样实现接口
 * 包含一个真实类，并实现接口的方法，
 * 对外隐藏真实类的细节...
 */
public class ProxyImage implements Image {
    private Image realIamge;

    private String fileName;

    public ProxyImage(String fileName) {
       this.fileName=fileName;
    }

    @Override
    public void display() {
        if(realIamge==null){
            realIamge=new RealImage(fileName);
        }
        realIamge.display();
    }
}
