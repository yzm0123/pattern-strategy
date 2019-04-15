package com.gupaoedu.vip.pattern.strategy.pay.payport;

import com.gupaoedu.vip.pattern.strategy.pay.MsgResult;

public abstract class PayMent {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid,double amount){

        if(queryBalance(uid) < amount){
            return new MsgResult(500,getName() +"支付失败","余额不足");
        }else {
            return new MsgResult(200,getName() + "支付成功","支付金额" + amount);
        }
    }


}
