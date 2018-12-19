package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NJTZ on 2018/12/19.
 */
public class WechatServer implements Observerable {
    private List<Observer> observerList;
    private String message;

    public WechatServer() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!observerList.isEmpty()){
            observerList.remove(observer);
        }

    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("wechat update msg:"+message);
        //消息更新，通知观察者
        notifyObserver();
    }
}
