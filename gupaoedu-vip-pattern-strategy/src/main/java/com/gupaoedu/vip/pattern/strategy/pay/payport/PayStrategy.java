package com.gupaoedu.vip.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

    private PayStrategy(){}

    private static Map<String,PayMent> payStrategyMap = new HashMap<String,PayMent>();

    public static final String ALI_PAY = "AliPay";
    public static final String APPLE_PAY = "ApplePay";
    public static final String JD_PAY = "JingDongPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WeChatPay";
    public static final String DEFAULT_PAY = "AliPay";

    static {
        payStrategyMap.put(ALI_PAY,new AliPay());
        payStrategyMap.put(APPLE_PAY,new ApplePay());
        payStrategyMap.put(JD_PAY,new JDPay());
        payStrategyMap.put(UNION_PAY,new AliPay());
        payStrategyMap.put(WECHAT_PAY,new UnionPay());
        payStrategyMap.put(DEFAULT_PAY,new AliPay());
    }

    public static PayMent getPayStrategy(String payKey){
        if (!payStrategyMap.containsKey(payKey)){
            return payStrategyMap.get(DEFAULT_PAY);
        }
        return payStrategyMap.get(payKey);
    }


}
