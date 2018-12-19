package com.observer;

/**
 * Created by NJTZ on 2018/12/19.
 */
public class User implements Observer {
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.message=msg;
        read();
    }

    public void read(){
        System.out.println(name+",received msg from wechat server："+message);
    }
}
