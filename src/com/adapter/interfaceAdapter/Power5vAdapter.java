package com.adapter.interfaceAdapter;

import com.adapter.objectAdapter.AC220;

/**
 * 5V的适配器
 * Created by NJTZ on 2018/12/14.
 */
public class Power5vAdapter extends MiddleAdapter {

    //构造方法
    public Power5vAdapter(AC110 ac110) {
        super(ac110);
    }

    @Override
    public int outPut5v() {
        System.out.println("调用了输出5V的方法...");
        if(ac110!=null)
        return ac110.outPut110()/22;
        return 0;
    }
}
