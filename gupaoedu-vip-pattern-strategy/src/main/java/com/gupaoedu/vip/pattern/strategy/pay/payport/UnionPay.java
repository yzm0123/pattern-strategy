package com.gupaoedu.vip.pattern.strategy.pay.payport;

public class UnionPay extends PayMent{
    @Override
    public String getName() {
        return "云闪付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 888;
    }
}
