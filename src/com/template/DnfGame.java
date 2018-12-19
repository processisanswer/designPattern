package com.template;

/**
 * Created by NJTZ on 2018/12/18.
 */
public class DnfGame extends Game {
    @Override
    void init() {
        System.out.println("init dnf game success！");
    }

    @Override
    void startPlay() {
        System.out.println("start play dnf game...");
    }

    @Override
    void end() {
        System.out.println("end dnf game...");
    }
}
