package com.gupaoedu.vip.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> promotionStrategyMap = new HashMap<String,PromotionStrategy>();

    static {
        promotionStrategyMap.put(PromotionStrategyKey.COUPON,new CouponStrategy());
        promotionStrategyMap.put(PromotionStrategyKey.CUSHBACK,new CushBackStrategy());
        promotionStrategyMap.put(PromotionStrategyKey.GROUPBUY,new GroupBuyStrategy());
    }

    private static PromotionStrategy EMPTY_STRATEGY = new EmptyStrategy();

    private PromotionStrategyFactory(){}

    private interface PromotionStrategyKey {
        String COUPON = "COUPON";
        String CUSHBACK = "CUSHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static PromotionStrategy getPromotionStrategy (String promotionKey){
        return promotionStrategyMap.get(promotionKey) == null? EMPTY_STRATEGY : promotionStrategyMap.get(promotionKey);
    }

}
