package com.yuk.pattern.strategy.zz.strategy.payport;

import com.yuk.pattern.strategy.zz.strategy.PayState;

/**
 * Created by yuk on 2018/10/10.
 */
public class AliPay implements Payment{
    @Override
    public PayState pay(String uid, double amout) {

        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"交易成功",amout);
    }
}
