package com.yuk.pattern.strategy.zz.strategy;

/**
 * 支付完成后的状态信息
 * Created by yuk on 2018/10/10.
 */
public class PayState {
    private int code;
    private String msg;
    private Object data;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {

        return "支付状态: [" + code + "]," + msg + ", 交易详情:" + data ;
    }
}
