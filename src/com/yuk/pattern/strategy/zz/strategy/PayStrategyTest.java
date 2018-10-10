package com.yuk.pattern.strategy.zz.strategy;

import com.yuk.pattern.strategy.zz.strategy.payport.PayType;

/**
 * Created by yuk on 2018/10/10.
 */
public class PayStrategyTest {

   public static void main(String[] args) {
       Order order = new Order("1","2018101000001",2543);
       System.out.println(order.pay(PayType.WECHAT_PAY));
   }
}
