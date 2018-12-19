package com.strategy;

import java.math.BigDecimal;

/**
 * Created by NJTZ on 2018/12/17.
 */
public class CommonCustomerQuoteStrategy implements QuoteStrategy{
    //一般顾客，报价策略为原价
    @Override
    public BigDecimal getRealPay(BigDecimal bigDecimal) {
        System.out.println("普通客户暂不打折~");
        return bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}
