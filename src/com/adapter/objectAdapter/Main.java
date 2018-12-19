package com.adapter.objectAdapter;

/**
 * Created by NJTZ on 2018/12/14.
 */
public class Main {
    public static void main(String[] args) {
        PowerAdapter powerAdapter=new PowerAdapter(
                new AC220()
        );
        System.out.println(powerAdapter.out5v());
    }
}
