package com.gupaoedu.vip.pattern.strategy.pay;

import com.gupaoedu.vip.pattern.strategy.pay.payport.PayStrategy;

public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1","201903310001",234);
//        MsgResult msg = order.pay(PayStrategy.APPLE_PAY);
        MsgResult msg = order.pay(PayStrategy.DEFAULT_PAY);
        System.out.println(msg);
    }
}
