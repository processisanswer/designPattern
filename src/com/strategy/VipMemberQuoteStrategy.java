package com.strategy;

import java.math.BigDecimal;

/**
 * Created by NJTZ on 2018/12/17.
 */
public class VipMemberQuoteStrategy implements QuoteStrategy {
    @Override
    public BigDecimal getRealPay(BigDecimal bigDecimal) {
        //vip会员报价策略打8折
        System.out.println("Vip会员客户，现打8折~");
        return bigDecimal.multiply(new BigDecimal(0.8)).setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}
