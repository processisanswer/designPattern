package com.strategy;

import java.math.BigDecimal;

/**
 * Created by NJTZ on 2018/12/17.
 */
public class StrategyMain {
    public static void main(String[] args) {
        //vip
        StrategyContext context=new StrategyContext(new VipMemberQuoteStrategy());
        BigDecimal originalPrice=new BigDecimal(159.98);
        System.out.println("需要实付情况"+context.offerPrice(originalPrice));

        //普通会员
        StrategyContext context0=new StrategyContext(new CommonMemberQuoteStrategy());
        BigDecimal originalPrice0=new BigDecimal(164.24);
        System.out.println("需要实付情况"+context0.offerPrice(originalPrice0));
    }
}
