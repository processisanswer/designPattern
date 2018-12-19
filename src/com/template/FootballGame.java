package com.template;

/**
 * Created by NJTZ on 2018/12/18.
 */
public class FootballGame extends Game {
    @Override
    void init() {
        System.out.println("init football game success!");
    }

    @Override
    void startPlay() {
        System.out.println("start play football game...");
    }

    @Override
    void end() {
        System.out.println("end football game!");
    }
}
