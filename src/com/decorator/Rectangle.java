package com.decorator;

/**
 * Created by NJTZ on 2018/12/14.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a Rectangle ~");
    }
}
