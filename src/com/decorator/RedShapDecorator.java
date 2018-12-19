package com.decorator;

/**
 * Created by NJTZ on 2018/12/14.
 * 实体装饰类——具体实现的功能
 *
 */
public class RedShapDecorator extends ShapeDecorator {

    public RedShapDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();

    }

    private void setRedBorder() {
        System.out.println("Border Color:red...");
    }
}
