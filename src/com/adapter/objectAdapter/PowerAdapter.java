package com.adapter.objectAdapter;

/**对象适配器
 * Adapter持有Resource类的实例，以持有对象的方式实现适配功能
 * Created by NJTZ on 2018/12/14.
 */
public class PowerAdapter extends DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    int out5v() {
        if (ac220!=null)
        return ac220.out220v()/44;
        return 0;
    }
}
