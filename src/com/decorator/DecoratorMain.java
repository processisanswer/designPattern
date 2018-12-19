package com.decorator;

/**
 * Created by NJTZ on 2018/12/14.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //装饰前
        rectangle.draw();
        //装饰后
        RedShapDecorator redShapDecorator = new RedShapDecorator(rectangle);
        redShapDecorator.draw();

    }
}
