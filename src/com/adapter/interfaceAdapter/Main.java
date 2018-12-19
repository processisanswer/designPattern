package com.adapter.interfaceAdapter;

/**
 * 接口适配器
 * Created by NJTZ on 2018/12/14.
 */
public class Main {
    public static void main(String[] args) {
        //已经实现子类方式
        Power5vAdapter power5vAdapter = new Power5vAdapter(
                new AC110()
        );
        System.out.println(power5vAdapter.outPut5v());

        //直接实现子类方式,重写方法
        MiddleAdapter middleAdapter =
                new MiddleAdapter(new AC110()) {
                    @Override
                    public int outPut5v() {
                        System.out.println("直接实现子类方式...");
                        return ac110.outPut110() / 22;
                    }
                };
        System.out.println(middleAdapter.outPut5v());

    }


}
