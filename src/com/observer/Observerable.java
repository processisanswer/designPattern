package com.observer;

/**
 * Created by NJTZ on 2018/12/19.
 */
public interface Observerable {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();


}
