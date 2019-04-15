package com.gupaoedu.vip.pattern.strategy.promotion;

public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("GroupBuyStrategy:团购活动优惠");
    }
}
