package com.gupaoedu.vip.pattern.strategy.pay.payport;

public class ApplePay extends PayMent {
    @Override
    public String getName() {
        return "苹果支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 999;
    }
}
