package com.adapter.classAdapter;

/**
 * 类适配器器
 * Created by NJTZ on 2018/12/14.
 * java 单继承  Destination类必须是接口，
 * Adapter类继承Source 并实现Destination，完成适配的功能
 * 这样会导致Adapter里暴露了Source的方法，使用起来的成本增加
 */
public class ClassAdapter extends Source implements Destination{
    @Override
    public int out5v() {
        return out220v()/44;
    }
}
