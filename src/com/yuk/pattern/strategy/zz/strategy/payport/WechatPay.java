package com.yuk.pattern.strategy.zz.strategy.payport;

import com.yuk.pattern.strategy.zz.strategy.PayState;

/**
 * Created by yuk on 2018/10/10.
 */
public class WechatPay implements Payment{
    @Override
    public PayState pay(String uid, double amout) {

        System.out.println("欢迎使用微信支付");
        System.out.println("直接从微信红包扣款");
        return new PayState(200,"支付成功",amout);
    }
}
