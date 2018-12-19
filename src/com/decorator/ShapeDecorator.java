package com.decorator;

/**
 * Created by NJTZ on 2018/12/14.
 * 实现抽象接口（模板）
 * 抽象装饰类——定义经过装饰后类，所具有的功能.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }

    ;
}
