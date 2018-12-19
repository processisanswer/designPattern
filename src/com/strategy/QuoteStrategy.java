package com.strategy;

import java.math.BigDecimal;

/**
 * 总体报价接口
 * Created by NJTZ on 2018/12/17.
 */
public interface QuoteStrategy {
    BigDecimal getRealPay(BigDecimal bigDecimal);
}
