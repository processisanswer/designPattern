package com.adapter.interfaceAdapter;

import com.adapter.objectAdapter.AC220;

/**中间适配器
 * 抽象类，写了空方法，
 * 等着不同的子类去实现需要的方法
 * 不同的子类是不同的适配器
 * Destination是一个多功能的接口
 * Created by NJTZ on 2018/12/14.
 */
public abstract class MiddleAdapter implements DCOutput{

    protected AC110 ac110;

    public MiddleAdapter(AC110 ac110) {
        this.ac110 = ac110;
    }

    @Override
    public int outPut5v() {
        return ac110.outPut110();
    }

    @Override
    public int outPut10v() {
        return ac110.outPut110();
    }

    @Override
    public int outPut20() {
        return ac110.outPut110();
    }

    @Override
    public int outPut30() {
        return ac110.outPut110();
    }

    @Override
    public int outPut60() {
        return ac110.outPut110();
    }
}
