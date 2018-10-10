package com.yuk.pattern.strategy.zz.strategy;

import com.yuk.pattern.strategy.zz.strategy.payport.PayType;

/**
 * Created by yuk on 2018/10/10.
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay (PayType payType){

        return payType.getPayment().pay(this.uid,this.amount);
    }


}
