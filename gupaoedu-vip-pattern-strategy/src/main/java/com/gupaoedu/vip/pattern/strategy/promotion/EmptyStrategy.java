package com.gupaoedu.vip.pattern.strategy.promotion;

public class EmptyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("EmptyStrategy：无优惠活动！");
    }
}
