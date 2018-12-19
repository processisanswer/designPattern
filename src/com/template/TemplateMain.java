package com.template;

/**
 * Created by NJTZ on 2018/12/18.
 */
public class TemplateMain {
    public static void main(String[] args) {
        Game footballGame=new FootballGame();
        footballGame.playGame();
        System.out.println("-----------");
        Game dnfGame=new DnfGame();
        dnfGame.playGame();
    }
}
