package com.gupaoedu.vip.pattern.strategy.promotion;

public class CushBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("CushBackStrategy:返现活动优惠");
    }
}
