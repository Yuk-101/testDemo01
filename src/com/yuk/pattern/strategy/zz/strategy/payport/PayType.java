package com.yuk.pattern.strategy.zz.strategy.payport;

/**
 * 枚举支付类型
 * Created by yuk on 2018/10/10.
 */
public enum PayType {
    WECHAT_PAY(new WechatPay()),
    ALI_PAY(new AliPay()),
    JD_PAY(new JDPay());

    private Payment payment;
    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
