package com.strategy;

import java.math.BigDecimal;

/**
 * Created by NJTZ on 2018/12/17.
 */
public class CommonMemberQuoteStrategy implements QuoteStrategy {
    //一般会员打9折
    @Override
    public BigDecimal getRealPay(BigDecimal bigDecimal) {
        System.out.println("会员客户现打9折~");
        return bigDecimal.multiply((new BigDecimal(0.9))).setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}
