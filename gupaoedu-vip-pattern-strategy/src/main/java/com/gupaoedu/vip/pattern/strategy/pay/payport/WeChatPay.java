package com.gupaoedu.vip.pattern.strategy.pay.payport;

public class WeChatPay extends PayMent {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 666;
    }
}
