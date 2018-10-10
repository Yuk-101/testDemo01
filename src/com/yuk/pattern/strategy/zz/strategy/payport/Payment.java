package com.yuk.pattern.strategy.zz.strategy.payport;

import com.yuk.pattern.strategy.zz.strategy.PayState;

/**
 * Created by yuk on 2018/10/10.
 */
public interface Payment {
    public PayState pay(String uid , double amout);
}
