package com.template;

/**
 * Created by NJTZ on 2018/12/18.
 */
public abstract class Game {
   abstract void init();
   abstract void startPlay();
   abstract void end();
    public void playGame(){
        init();
        startPlay();
        end();
    }
}
