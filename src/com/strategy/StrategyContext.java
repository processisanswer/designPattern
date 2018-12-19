package com.strategy;

import java.math.BigDecimal;

/**
 * 策略上下文
 * Created by NJTZ on 2018/12/17.
 */
public class StrategyContext {
    private QuoteStrategy quoteStrategy;

    public StrategyContext(QuoteStrategy quoteStrategy) {
        this.quoteStrategy = quoteStrategy;
    }
    //对外提供报价
    public BigDecimal offerPrice(BigDecimal bigDecimal){
        return  quoteStrategy.getRealPay(bigDecimal);
    }
}
