package com.adapter.classAdapter;

/**类适配器模式
 * Created by NJTZ on 2018/12/14.
 */
public class Main {
    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        int needU=classAdapter.out5v();
        System.out.println(needU);
    }
}
